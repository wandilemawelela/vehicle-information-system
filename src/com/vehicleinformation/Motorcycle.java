package com.vehicleinformation;

/**
 * Motorcycle class implements Vehicle and MotorVehicle interfaces.
 */

public class Motorcycle implements Vehicle, MotorVehicle {
    private String make;
    private String model;
    private int year;
    private int numberOfWheels;
    private MotorcycleType type;

    public Motorcycle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    public void setNumberOfWheels(int wheels) { this.numberOfWheels = wheels; }
    public int getNumberOfWheels() { return numberOfWheels; }

    public void setMotorcycleType(MotorcycleType type) { this.type = type; }
    public MotorcycleType getMotorcycleType() { return type; }

    @Override
    public String toString() {
        return "Motorcycle [" + make + " " + model + ", Year: " + year +
                ", Wheels: " + numberOfWheels +
                ", Type: " + type + "]";
    }
}