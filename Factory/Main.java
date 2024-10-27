package Factory;

import Factory.Models.Vehicle;

public class Main {
    public static void main(String[] args) {
       
        CreateVehicle park = new CreateVehicle();

        Vehicle voiture1 = park.create("Voiture", 6, 120);
        Vehicle voiture2 = park.create("Voiture", 6, 120);
        Vehicle voiture3 = park.create("Voiture", 6, 120);
        Vehicle voiture4 = park.create("Voiture", 6, 120);
        Vehicle voiture5 = park.create("Voiture", 6, 120);

        Vehicle bus1 = park.create("Bus", 18, 90);
        Vehicle bus2 = park.create("Bus", 18, 90);
        Vehicle bus3 = park.create("Bus", 18, 90);

        Vehicle bicyclette1 = park.create("Bicyclette", 1.5, 30);
        Vehicle bicyclette2 = park.create("Bicyclette", 1.5, 30);

        Vehicle camion1 = park.create("Camion", 12, 80);

     
        // System.out.println(voiture1);
        // System.out.println(bus1);
        // System.out.println(bicyclette1);

    }
}


