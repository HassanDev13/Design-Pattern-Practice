package Observer.Models.Observers;

import Observer.Models.Observer;

public class BinaryObserver implements Observer {

    @Override
    public void update(int value) {
        System.out.println("Binary String: " + Integer.toBinaryString(value));
    }
    
}
