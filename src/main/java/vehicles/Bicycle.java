package vehicles;

/**
 * Step 1: Complete the Bicycle subclass.
 * Extends {@link Vehicle}.
 */
public class Bicycle extends Vehicle {

    private int gearCount;

    public Bicycle(String model, int maxSpeed, int gearCount) {
        super(model, maxSpeed, 1);

        // Step 1.1: Validate gearCount
        if (gearCount <= 0) {
            throw new IllegalArgumentException("Gear count must be positive");
        }

        // Step 1.2: Assign gearCount
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        // Step 1.3: Return gearCount
        return gearCount;
    }

    @Override
    public double calculateTravelTime(double distanceInKm) {
        // Step 1.4: Validate distance
        if (distanceInKm <= 0) {
            throw new IllegalArgumentException("Distance must be positive");
        }

        // Step 1.5: Return travel time
        return distanceInKm / (double) getMaxSpeed();
    }
}