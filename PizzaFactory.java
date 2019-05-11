public class PizzaFactory {
    
    public static Pizza createKoreaPizza() {
        return new KoreaPizza();
    }
    
    public static Pizza createAmericaPizza() {
        return new AmericaPizza();
    }
    
    public static Pizza createJapanPizza() {
        return new JapanPizza();
    }
}

interface Pizza {}

class KoreaPizza implements Pizza {
    
}

class AmericaPizza implements Pizza {
    
}

class JapanPizza implements Pizza {
    
}

// example
class Example {
    public void example() {
        Pizza koreaPizza = PizzaFactory.createKoreaPizza();
        Pizza americaPizza = PizzaFactory.createAmericaPizza();
        Pizza japanPizza = PizzaFactory.createJapanPizza();
    }
}
