package Factory.Example1.Models;

public class  Camion extends Vehicle {

    public Camion(double longueur, double vitMax) {
        super(longueur, vitMax);
    }

    @Override
    public String toString() {
        return "Camion[length=" + longueur + "m, max speed=" + vitMax + "km/h, current speed=" + vitesse + "km/h]";
    }
    
}
