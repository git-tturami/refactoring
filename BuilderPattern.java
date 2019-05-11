public class BuilderPattern {
    private int a, b, c;
    String d, e;

    
    public BuilderPattern(int a, int b, int c, String d, String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static class Builder {
        private int a, b, c;
        private String d, e;
        
        public Builder setA(int a) {
            this.a = a;
            return this;
        }
        
        public Builder setB(int b) {
            this.b = b;
            return this;
        }
        
        public Builder setC(int c) {
            this.c = c;
            return this;
        }
        
        public Builder setD(String d) {
            this.d = d;
            return this;
        }
        
        public Builder setE(String e) {
            this.e = e;
            return this;
        }
        
        public BuilderPattern build() {
            return new BuilderPattern(a, b, c, d, e);
        }
    }
}

class Example {
    public void example() {
        BuilderPattern bp = new BuilderPattern.Builder()
                .setA(1)
                .setB(2)
                .setC(-3)
                .setD("hi")
                .setE("bye~")
                .build();
    }
}
