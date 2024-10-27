package Factory.Example2.Models;
import Factory.Example2.Models.Factories.FactoryPlayer;

import Factory.Example2.Models.Factories.Factory2DPlayer;
import Factory.Example2.Models.Factories.Factory3DPlayer;

public class Terrain {

    public Terrain() {
        FactoryPlayer playerFactory3D = new Factory3DPlayer();
        FactoryPlayer playerFactory2D = new Factory2DPlayer();

        playerFactory2D.createArriere();
        playerFactory2D.createGardien();

        playerFactory3D.createArriere();
        playerFactory3D.createGardien();
    }
}
