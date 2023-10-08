/**
 * @author Neil Mathias
 * @version 1.0
 * Tracks the characteristics of tokimons such as name, type, height, weight and strength.
 */
package src.com.nmathias.Tokimon.java;

public class Tokimon {
    private String name;
    private String type;
    private double height;
    private double weight;
    private double strength;

    //constructor
    public Tokimon(String name, String type, double height, double weight, double strength) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    // string representation of the Tokimon object
    @Override
    public String toString() {
        return getClass().getName() + " [" +
                "Name='" + name + '\'' +
                ", Type='" + type + '\'' +
                ", Height=" + height +
                ", Weight=" + weight +
                ", Strength=" + strength +
                ']';
    }
}