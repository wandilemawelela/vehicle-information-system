package com.vehicleinformation;

/**
 * TruckVehicle interface defines truck-specific behavior.
 */

public interface TruckVehicle {
	void setCargoCapacity(double capacity);
    double getCargoCapacity();

    void setTransmissionType(TransmissionType transmission);
    TransmissionType getTransmissionType();
}
