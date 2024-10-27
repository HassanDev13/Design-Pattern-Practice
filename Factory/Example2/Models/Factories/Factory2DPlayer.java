package Factory.Example2.Models.Factories;

import Factory.Example2.Models.Players.Arriere;
import Factory.Example2.Models.Players.Gardien;
import Factory.Example2.Models.Players.Player2D3D.A2D;
import Factory.Example2.Models.Players.Player2D3D.G2D;

public class Factory2DPlayer implements FactoryPlayer {

    @Override
    public Arriere createArriere() {
        return new A2D();
    }
    @Override
    public Gardien createGardien() {
        return new G2D();
    }

}
