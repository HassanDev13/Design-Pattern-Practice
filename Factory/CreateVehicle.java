package Factory;

import Factory.Models.*;

public class CreateVehicle {
    public Vehicle create(String type, double longueur, double vitMax) {
        if (type.equals("Voiture")) {
            return new Voiture(longueur, vitMax);
        } else if (type.equals("Bus")) {
            return new Bus(longueur, vitMax);
        } else if (type.equals("Bicyclette")) {
            return new Bicyclette(longueur, vitMax);
        } else if (type.equals("Camion")) {
            return new Camion(longueur, vitMax);
        } else {
            return null;
        }
    }
}
