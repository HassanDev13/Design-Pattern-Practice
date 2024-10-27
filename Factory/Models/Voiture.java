package Factory.Models;

public class  Voiture extends Vehicle {

    public Voiture(double longueur, double vitMax) {
        super(longueur, vitMax);
    }

    @Override
    public String toString() {
        return "Voiture[length=" + longueur + "m, max speed=" + vitMax + "km/h, current speed=" + vitesse + "km/h]";
    }
    
}
