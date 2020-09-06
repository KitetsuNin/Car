public class CarTest {
    public static void main(String[] args) {

        Car b = new Car("Mustang", 300, 3);

        System.out.println(b.getCarName());
        System.out.println(b.getMaxSpeed());
        System.out.println(b.getCarAge());

        Car c = new Car("Matiz", 10,100);

        System.out.println(c.getCarName());
        System.out.println(c.getMaxSpeed());
        System.out.println(c.getCarAge());

    }
}
