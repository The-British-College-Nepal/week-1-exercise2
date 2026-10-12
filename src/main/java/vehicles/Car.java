package vehicles;

/**
 * Step 2: Complete the Car subclass.
 * Extends {@link Vehicle}.
 */
public class Car extends Vehicle {

    private int fuelLevelPercent;

    public Car(String model, int maxSpeed, int passengerCapacity, int fuelLevelPercent) {
        super(model, maxSpeed, passengerCapacity);

        // Step 2.1: Validate fuel level
        if (fuelLevelPercent < 0 || fuelLevelPercent > 100) {
            throw new IllegalArgumentException("Fuel level must be between 0 and 100");
        }

        // Step 2.2: Assign fuel level
        this.fuelLevelPercent = fuelLevelPercent;
    }

    public int getFuelLevelPercent() {
        // Step 2.3
        return fuelLevelPercent;
    }

    public void refuel(int amount) {
        // Step 2.4: Validate amount
        if (amount <= 0) {
            throw new IllegalArgumentException("Refuel amount must be positive");
        }

        // Step 2.5: Add fuel, capped at 100
        this.fuelLevelPercent = Math.min(100, this.fuelLevelPercent + amount);
    }

    @Override
    public double calculateTravelTime(double distanceInKm) {
        // Step 2.6: Validate distance
        if (distanceInKm <= 0) {
            throw new IllegalArgumentException("Distance must be positive");
        }

        // Step 2.7: Return travel time
        return distanceInKm / getMaxSpeed();
    }
}