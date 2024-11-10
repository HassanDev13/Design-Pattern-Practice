package Observer.Models.Observers;

import Observer.Models.Observer;

public class OctalObserver implements Observer {

    @Override
    public void update(int value) {
        System.out.println("Octal String: " + Integer.toOctalString(value));
    }
    
}
