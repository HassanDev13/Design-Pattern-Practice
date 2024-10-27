package Factory.Example2.Models.Factories;

import Factory.Example2.Models.Players.Arriere;
import Factory.Example2.Models.Players.Gardien;
import Factory.Example2.Models.Players.Player2D3D.A3D;
import Factory.Example2.Models.Players.Player2D3D.G3D;

public class Factory3DPlayer implements FactoryPlayer {
    
    @Override
    public Arriere createArriere() {
        return new A3D();
    }
    @Override
    public Gardien createGardien() {
        return new G3D();
    }


}
