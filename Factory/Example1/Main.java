package Factory.Example1;

import Factory.Example1.Models.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle voiture1 = CreateVehicle.create("Voiture", 6, 120);
        Vehicle voiture2 = CreateVehicle.create("Voiture", 6, 120);
        Vehicle voiture3 = CreateVehicle.create("Voiture", 6, 120);
        Vehicle voiture4 = CreateVehicle.create("Voiture", 6, 120);
        Vehicle voiture5 = CreateVehicle.create("Voiture", 6, 120);

        Vehicle bus1 = CreateVehicle.create("Bus", 18, 90);
        Vehicle bus2 = CreateVehicle.create("Bus", 18, 90);
        Vehicle bus3 = CreateVehicle.create("Bus", 18, 90);

        Vehicle bicyclette1 = CreateVehicle.create("Bicyclette", 1.5, 30);
        Vehicle bicyclette2 = CreateVehicle.create("Bicyclette", 1.5, 30);

        Vehicle camion1 = CreateVehicle.create("Camion", 12, 80);

     
        // System.out.println(voiture1);
        // System.out.println(bus1);
        // System.out.println(bicyclette1);

    }
}


