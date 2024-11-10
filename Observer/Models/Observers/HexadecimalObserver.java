package Observer.Models.Observers;

import Observer.Models.Observer;

public class HexadecimalObserver implements Observer {

    @Override
    public void update(int value) {
        System.out.println("Hexadecimal String: " + Integer.toHexString(value));
    }
    
}
