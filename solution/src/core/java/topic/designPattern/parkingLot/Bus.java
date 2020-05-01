package core.java.topic.designPattern.parkingLot;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
public class Bus extends Vehicle{
    public Bus(){
        spotsNeeded = 5;
        size = VehicleSize.LARGE;
    }

    @Override
    public boolean canFitInSpot(ParkingSpot spot){
        //checks if the spot is a Large, does NOT check num of spots
        return spot.getSize() == VehicleSize.LARGE;
    }
}