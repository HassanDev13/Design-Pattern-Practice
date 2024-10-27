package Factory.Models;

public class  Bicyclette extends Vehicle {

    public Bicyclette(double longueur, double vitMax) {
        super(longueur, vitMax);
    }
    
    @Override
    public String toString() {
        return "Bicyclette[length=" + longueur + "m, max speed=" + vitMax + "km/h, current speed=" + vitesse + "km/h]";
    }
}
