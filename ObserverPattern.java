import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<Subscriber> list = new ArrayList<>();
    
    public void registerMachine(Subscriber subscriber) {
        list.add(subscriber);
    }
    
    public void notifyDataUpdate() {
        for (Subscriber sub : list) {
            sub.notifyDataUpdate();
        }
    }
}

interface Subscriber {
    void notifyDataUpdate();
}

class SubscriberA implements Subscriber {
    @Override
    public void notifyDataUpdate() {
        System.out.println("SubscriberA accepted");
    }
}

class SubscriberB implements Subscriber {
    @Override
    public void notifyDataUpdate() {
        System.out.println("SubscriberB accepted");
    }
}

class SubscriberC implements Subscriber {
    @Override
    public void notifyDataUpdate() {
        System.out.println("SubscriberC accepted");
    }
}

// example
class Example {
    public void example() {
        WeatherStation weatherStation = new WeatherStation();
        
        Subscriber subA = new SubscriberA();
        Subscriber subB = new SubscriberB();
        Subscriber subC = new SubscriberC();
        
        weatherStation.registerMachine(subA);
        weatherStation.registerMachine(subB);
        weatherStation.registerMachine(subC);
        
        weatherStation.notifyDataUpdate();
    }
}
