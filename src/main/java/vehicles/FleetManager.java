package vehicles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Step 3: Implement the Polymorphic FleetManager.
 * Demonstrates:
 * - Polymorphism (holding heterogeneous subclasses in a List<Vehicle>)
 * - Invariant checking (rejecting null vehicles)
 * - Encapsulation (unmodifiable view)
 */
public class FleetManager {

    private final List<Vehicle> vehicles = new ArrayList<>();

    /**
     * Adds a vehicle to the fleet.
     *
     * @param vehicle vehicle to add (must not be null)
     */
    public void addVehicle(Vehicle vehicle) {
        // Step 3.1: Reject null
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null");
        }

        // Step 3.2: Add to the fleet
        vehicles.add(vehicle);
    }

    public int getVehicleCount() {
        return vehicles.size();
    }

    /**
     * Calculates the total passenger capacity across all vehicles in the fleet.
     * Must demonstrate polymorphic iteration over List<Vehicle>.
     *
     * @return total passenger capacity
     */
    public int getTotalPassengerCapacity() {
        // Step 3.3: Sum capacities
        int total = 0;
        for (Vehicle v : vehicles) {
            total += v.getPassengerCapacity();
        }
        return total;
    }

    /**
     * Finds the fastest vehicle in the fleet based on maxSpeed.
     *
     * @return the fastest Vehicle, or null if fleet is empty
     */
    public Vehicle findFastestVehicle() {
        // Step 3.4: Find highest maxSpeed
        if (vehicles.isEmpty()) {
            return null;
        }
        Vehicle fastest = vehicles.get(0);
        for (Vehicle v : vehicles) {
            if (v.getMaxSpeed() > fastest.getMaxSpeed()) {
                fastest = v;
            }
        }
        return fastest;
    }

    public List<Vehicle> getVehicles() {
        return Collections.unmodifiableList(vehicles);
    }
}