public class Singleton {
    private Singleton() {
        // 생성자를 private으로 정의
    }

    private static Singleton instance;
    
    public void func() {
        System.out.println("singleton");
    }

    // case 1 : 가장 기초적인 싱글톤
    public static Singleton getInstance_case1() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // case 2 : 동기화
    public static synchronized Singleton getInstance_case2() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // case 3 : Double check locking
    public static Singleton getInstance_dcl() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // case 4 : Lazy holder
    // nested class는 singleton class 로딩 시에는 초기화 되지 않고, 어디선가 LazyHolder를 참조할 때 로딩된다.
    // 따라서 처음 사용할때 메모리에 올라오므로 메모리 관점에서도 효율적
    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance_lazyHolder() {
        return LazyHolder.INSTANCE;
    }
}

// case 5 : Enum class
enum Singleton_enum {
    INSTANCE;
    public void func() {
        System.out.println("singleton");
    }
}

// 외부에서 사용하는 예제
class example {
    public void example() {
        Singleton.getInstance_case1().func();
        Singleton.getInstance_case2().func();
        Singleton.getInstance_dcl().func();
        Singleton.getInstance_lazyHolder().func();
        Singleton_enum.INSTANCE.func();
    }    
}
