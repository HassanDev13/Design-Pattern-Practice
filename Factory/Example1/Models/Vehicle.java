package Factory.Example1.Models;

public abstract class Vehicle {
	
    protected double vitesse = 0;
    protected double vitMax;
    protected double longueur;

    public Vehicle(double longueur, double vitMax) {
        this.longueur = longueur;
        this.vitMax = vitMax;
    }

    // Getters
    public double getVitesse() {
        return vitesse;
    }

    public double getLongueur() {
        return longueur;
    }

    public void accelerer(double speed) {
        vitesse += speed;
        if (vitesse > vitMax) {
            vitesse = vitMax;
        }
    }

    public void decelerer(double speed) {
        vitesse -= speed;
        if (vitesse < 0) {
            vitesse = 0; 
        }
    }

    @Override
    public String toString() {
        return "Vehicle[length=" + longueur + "m, max speed=" + vitMax + "km/h, current speed=" + vitesse + "km/h]";
    }
}
