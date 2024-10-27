package Factory.Example2.Models.Factories;

import Factory.Example2.Models.Players.Arriere;
import Factory.Example2.Models.Players.Gardien;

public interface FactoryPlayer {

    public Gardien createGardien();
    public Arriere createArriere();

}
