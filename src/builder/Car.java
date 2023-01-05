package builder;

public class Car {
        private String engine; // 엔진 종류
        private boolean airBag; // 에어백 유무
        private String color; // 색상
        private boolean cameraSensor; //카메라센서 유무
        private boolean AEB; //자동급제동장치 유무

    public Car(String engine, boolean airBag, String color, boolean cameraSensor, boolean AEB) {
        this.engine = engine;
        this.airBag = airBag;
        this.color = color;
        this.cameraSensor = cameraSensor;
        this.AEB = AEB;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engin='" + engine + '\'' +
                ", airBag=" + airBag +
                ", color='" + color + '\'' +
                ", cameraSensor=" + cameraSensor +
                ", AEB=" + AEB +
                '}';
    }
}
