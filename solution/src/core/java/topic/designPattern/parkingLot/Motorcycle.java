package core.java.topic.designPattern.parkingLot;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
public class Motorcycle extends Vehicle {

    public Motorcycle() {
        spotsNeeded = 1;
        size = VehicleSize.MOTORCYCLE;
    }

    @Override
    public boolean canFitInSpot(ParkingSpot spot) {
        //checks if the spot is a compact, motorcycle or a large
        return spot.getSize() == VehicleSize.LARGE
            || spot.getSize() == VehicleSize.COMPACT
            || spot.getSize() == VehicleSize.MOTORCYCLE;
    }
}
