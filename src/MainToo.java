import builder.*;

import java.util.List;
import java.util.Random;

public class MainToo {
    public static void main(String[] args) {

        //Main.builder1();
        MainToo.builder2();
    }

    public static void builder1() {
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

        Car car3 = builder.airBag(random.nextInt(2) == 0).build();
        System.out.println(car3.toString());
    }

    public static void builder2() {
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


    public List<String> test() {

        List<String> list = List.of("1", "2");
        return list;
    }

    public int calculate(int a, int b) {
        return add(a, b, 8);
    }

    private static int add(int a, int b, int c) {
        return a + b;
    }

    private int c;
    private int minus(int a ,int b){
        c = a - b;
        return c;
    }
}