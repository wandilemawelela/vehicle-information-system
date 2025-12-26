package com.vehicleinformation;

/**
 * Truck class implements Vehicle and TruckVehicle interfaces.
 */

public class Truck implements Vehicle, TruckVehicle {
    private String make;
    private String model;
    private int year;
    private double cargoCapacity;
    private TransmissionType transmission;

    public Truck(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    public void setCargoCapacity(double capacity) { this.cargoCapacity = capacity; }
    public double getCargoCapacity() { return cargoCapacity; }

    public void setTransmissionType(TransmissionType transmission) {
        this.transmission = transmission;
    }
    public TransmissionType getTransmissionType() { return transmission; }

    @Override
    public String toString() {
        return "Truck [" + make + " " + model + ", Year: " + year +
                ", Cargo: " + cargoCapacity + " tons" +
                ", Transmission: " + transmission + "]";
    }
}
