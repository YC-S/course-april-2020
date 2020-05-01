package core.java.topic.designPattern.parkingLot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
public abstract class Vehicle {

    protected List<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected VehicleSize size;

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public VehicleSize getSize() {
        return size;
    }

    public void parkInSpot(ParkingSpot s) {
        parkingSpots.add(s);
    }

    public void clearSpots() {
        for (int i = 0; i < parkingSpots.size(); i++) {
            parkingSpots.get(i).removeVehicle();
        }
        parkingSpots.clear();
    }

    public abstract boolean canFitInSpot(ParkingSpot spot);

}
