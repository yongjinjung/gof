import builder.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Main.builder1();
        Main.builder2();
    }

    public static void builder1(){
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

    public static void builder2(){
        Data data = new Data("정용진", 40);

        Builder textBuilder = new PlainTextBuilder(data);
        Builder jsonBuilder = new JSONBuilder(data);
        Builder xmlBuilder = new XMLBuilder(data);

        Director plainDirector = new Director(textBuilder);
        String build = plainDirector.build();
        System.out.println("build = " + build);

        Director jsonDirector = new Director(jsonBuilder);
        String build2 = jsonDirector.build();
        System.out.println("build2 = " + build2);

        Director xmlDirector = new Director(xmlBuilder);
        String build3 = xmlDirector.build();
        System.out.println("build3 = " + build3);


    }
}