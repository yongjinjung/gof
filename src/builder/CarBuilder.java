package builder;

public class CarBuilder {

    private String engine; // 엔진 종류
    private boolean airBag; // 에어백 유무
    private String color; // 색상
    private boolean cameraSensor; //카메라센서 유무
    private boolean AEB; //자동급제동장치 유무

    public CarBuilder engine(String engine) {
        this.engine = engine;

        return this;
    }

    public CarBuilder airBag(boolean airBag) {
        this.airBag = airBag;

        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;

        return this;
    }

    public CarBuilder cameraSensor(boolean cameraSensor) {
        this.cameraSensor = cameraSensor;

        return this;
    }

    public CarBuilder AEB(Boolean AEB) {
        this.AEB = AEB;

        return this;
    }

    public Car build(){
        return new Car(engine, airBag, color, cameraSensor, AEB);
    }
}
