package core.java.topic.oop;

/**
 * @author shiyuanchen
 * @created 2020/04/29
 * @project course-april-2020
 */
class Demo {

    public int add(int x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    public int add(double x, int y) {
        return (int) x + y;
    }

    public int add(int x, double y) {
        return x + (int) y;
    }
}

/**
 * @author shiyuanchen
 */
public class StaticPolymorphism {


    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.add(2,3));
        System.out.println(d1.add(2,3,4));
        System.out.println(d1.add(2,3.4));
        System.out.println(d1.add(2.5, 3));
    }

}
