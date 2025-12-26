package com.vehicleinformation;

/**
 * MotorVehicle interface defines motorcycle-specific behavior.
 */

public interface MotorVehicle {
	void setNumberOfWheels(int wheels);
    int getNumberOfWheels();

    void setMotorcycleType(MotorcycleType type);
    MotorcycleType getMotorcycleType();
}
