package core.java.topic.designPattern.parkingLot;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
public class Level {

    private int floor;
    private ParkingSpot[] spots;
    private int availableSpots = 0;
    private static final int SPOT_PER_ROW = 10;

    public Level(int flr, int numberSpots) {
        floor = flr;
        availableSpots = numberSpots;
        spots = new ParkingSpot[numberSpots];

        int largeSpots = numberSpots / 4;
        int bikeSpots = numberSpots / 4;
        int compactSpots = numberSpots - largeSpots - bikeSpots;

        for (int i = 0; i < numberSpots; i++) {
            VehicleSize size = VehicleSize.MOTORCYCLE;
            if (i < largeSpots) {
                size = VehicleSize.LARGE;
            } else if (i < largeSpots + compactSpots) {
                size = VehicleSize.COMPACT;
            }
            int row = i / SPOT_PER_ROW;
            spots[i] = new ParkingSpot(this, row, i, size);
        }
    }

    public int availableSpots() {
        return availableSpots;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        //find a place to park this vehicle, return false if failed
        if (availableSpots() < vehicle.getSpotsNeeded()) {
            return false;
        }

        int spotNumber = findAvailableSpots(vehicle);
        if (spotNumber < 0) {
            return false;
        }
        return parkStartingAtSpot(spotNumber, vehicle);
    }

    private boolean parkStartingAtSpot(int num, Vehicle vehicle) {
        //park a vehicle starting at the spot spotNumber, and continuing until vehicle.spotsNeeded
        vehicle.clearSpots();
        boolean success = true;
        for (int i = num; i < num + vehicle.spotsNeeded; i++) {
            success &= spots[i].park(vehicle);
        }
        availableSpots -= vehicle.spotsNeeded;
        return success;
    }

    private int findAvailableSpots(Vehicle vehicle) {
        int spotsNeeded = vehicle.getSpotsNeeded();
        int lastRow = -1;
        int spotsFound = 0;

        for (int i = 0; i < spots.length; i++) {
            ParkingSpot spot = spots[i];
            if (lastRow != spot.getRow()) {
                spotsFound = 0;
                lastRow = spot.getRow();
            }
            if (spot.canFitVehicle(vehicle)) {
                spotsFound++;
            } else {
                spotsFound = 0;
            }
            if (spotsFound == spotsNeeded) {
                return i - (spotsNeeded - 1);
            }
        }
        return -1;
    }

    public void spotFreed() {
        availableSpots++;
    }
}
