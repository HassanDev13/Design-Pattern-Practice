package Factory.Models;

public class  Bus extends Vehicle {

    public Bus(double longueur, double vitMax) {
        super(longueur, vitMax);
    }

    @Override
    public String toString() {
        return "Bus[length=" + longueur + "m, max speed=" + vitMax + "km/h, current speed=" + vitesse + "km/h]";
    }
    
}
