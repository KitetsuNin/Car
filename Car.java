public class Car {
    private String carName; //class fields
    private int maxSpeed;
    private int carAge;


    public Car (String name, int speed, int age) //constructor
    {
        carName = name;
        maxSpeed = speed;
        carAge = age;

    }
    public void print() {
        System.out.println(carName);
        System.out.println(maxSpeed);
        System.out.println(carAge);

    }

    //method
    public String getCarName() {
        return carName;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getCarAge() {
        return carAge;
    }
}

