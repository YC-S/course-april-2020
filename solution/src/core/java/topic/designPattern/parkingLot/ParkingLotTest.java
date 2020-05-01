package core.java.topic.designPattern.parkingLot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
class ParkingLotTest {

    Level level1 = new Level(1, 20);
    Level level2 = new Level(2, 20);
    Level level3 = new Level(3, 20);
    Level[] levels = {level1, level2, level3};
    ParkingLot parkingLot = new ParkingLot(levels);

    @Test
    public void testParkingLot() {
        assertTrue(parkingLot.parkVehicle(new Car()));
        assertTrue(parkingLot.parkVehicle(new Motorcycle()));
        assertEquals(level1.availableSpots(), 18);
        assertTrue(parkingLot.parkVehicle(new Bus()));
        assertEquals(level2.availableSpots(), 15);
        assertTrue(parkingLot.parkVehicle(new Bus()));
        assertEquals(level3.availableSpots(), 15);
    }

}