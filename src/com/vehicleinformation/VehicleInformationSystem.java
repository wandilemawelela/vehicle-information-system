package com.vehicleinformation;

import java.util.Scanner;

/**
 * Main program allowing user interaction with the vehicle system.
 */

public class VehicleInformationSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Select Vehicle Type:");
            System.out.println("1. Car");
            System.out.println("2. Motorcycle");
            System.out.println("3. Truck");
            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Make: ");
            String make = scanner.nextLine();

            System.out.print("Enter Model: ");
            String model = scanner.nextLine();

            System.out.print("Enter Year: ");
            int year = scanner.nextInt();

            switch (choice) {
                case 1:
                    Car car = new Car(make, model, year);
                    System.out.print("Number of Doors: ");
                    car.setNumberOfDoors(scanner.nextInt());

                    System.out.print("Fuel Type (PETROL/DIESEL/ELECTRIC): ");
                    car.setFuelType(FuelType.valueOf(scanner.next().toUpperCase()));
                    System.out.println(car);
                    break;

                case 2:
                    Motorcycle bike = new Motorcycle(make, model, year);
                    System.out.print("Number of Wheels: ");
                    bike.setNumberOfWheels(scanner.nextInt());

                    System.out.print("Motorcycle Type (SPORT/CRUISER/OFF_ROAD): ");
                    bike.setMotorcycleType(MotorcycleType.valueOf(scanner.next().toUpperCase()));
                    System.out.println(bike);
                    break;

                case 3:
                    Truck truck = new Truck(make, model, year);
                    System.out.print("Cargo Capacity (tons): ");
                    truck.setCargoCapacity(scanner.nextDouble());

                    System.out.print("Transmission (MANUAL/AUTOMATIC): ");
                    truck.setTransmissionType(
                            TransmissionType.valueOf(scanner.next().toUpperCase()));
                    System.out.println(truck);
                    break;

                default:
                    System.out.println("Invalid selection.");
            }

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
        } finally {
            scanner.close();
        }

	}

}
