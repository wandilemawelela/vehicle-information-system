package com.vehicleinformation;

/**
 * Car class implements Vehicle and CarVehicle interfaces.
 */

public class Car implements Vehicle, CarVehicle {
    private String make;
    private String model;
    private int year;
    private int numberOfDoors;
    private FuelType fuelType;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    public void setNumberOfDoors(int doors) { this.numberOfDoors = doors; }
    public int getNumberOfDoors() { return numberOfDoors; }

    public void setFuelType(FuelType fuelType) { this.fuelType = fuelType; }
    public FuelType getFuelType() { return fuelType; }

    @Override
    public String toString() {
        return "Car [" + make + " " + model + ", Year: " + year +
                ", Doors: " + numberOfDoors +
                ", Fuel: " + fuelType + "]";
    }
}