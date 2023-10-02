/**
 * @author Neil Mathias
 * @version 1.0
 * Tracks the characteristics of tokimons such as name, type, height, weight and strength.
 */
package com.nmathias.Tokimon.game;

public class Tokimon {
    private String name;
    private String type;
    private double height;
    private double weight;
    private double strength;

    public Tokimon(String name, String type, double height, double weight, double strength) {   //constructor
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
    }

    /*
    getters and setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

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