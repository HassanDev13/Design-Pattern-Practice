package Factory.Example2.Models.Players.Player2D3D;

import Factory.Example2.Models.Players.Gardien;

public class G2D extends Gardien {
    
    @Override
    public void play() {
        System.out.println("A2D play");
    }

    @Override
    public void rest() {
        System.out.println("A2D rest");
    }

    @Override
    public void shot() {
        System.out.println("A2D shot");
    }

    @Override
    public void pass() {
        System.out.println("A2D pass");
    }
}