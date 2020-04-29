package core.java.topic.oop;

/**
 * @author shiyuanchen
 * @created 2020/04/29
 * @project course-april-2020
 */
class Vehicle {
    public void move() {
        System.out.println("Vehicle can move.");
    }
}

class MotorBike extends Vehicle {

    @Override
    public void move() {
        System.out.println("MotorBike can move.");
    }
}

public class DynamicPolymorphism {

    public static void main(String[] args) {
        Vehicle v1 = new MotorBike();
        v1.move();
        v1 = new Vehicle();
        v1.move();
    }
}
