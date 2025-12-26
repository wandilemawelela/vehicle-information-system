package com.vehicleinformation;

/**
 * CarVehicle interface defines car-specific behavior.
 */

public interface CarVehicle {
	void setNumberOfDoors(int doors);
    int getNumberOfDoors();

    void setFuelType(FuelType fuelType);
    FuelType getFuelType();
}
