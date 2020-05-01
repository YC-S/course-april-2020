package core.java.topic.designPattern.parkingLot;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
public class Car extends Vehicle{
    public Car(){
        spotsNeeded = 1;
        size = VehicleSize.COMPACT;
    }

    @Override
    public boolean canFitInSpot(ParkingSpot spot){
        //checks if the spot is a compact or a large
        return spot.getSize() == VehicleSize.LARGE || spot.getSize() == VehicleSize.COMPACT;
    }
}
