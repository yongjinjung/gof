import builder.Car;
import builder.CarBuilder;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("V6", true, "white", true, false);
        Car car2 = new CarBuilder()
                .engine("V4")
                .airBag(true)
                .color("black")
                .cameraSensor(true)
                .AEB(false)
                .build();

        CarBuilder builder = new CarBuilder()
                .engine("V7")
                .color("Yellow")
                .cameraSensor(true)
                .AEB(false);

        Random random = new Random();

        Car car3 = builder.airBag( random.nextInt(2) == 0).build();
        System.out.println(car3.toString());
    }
}