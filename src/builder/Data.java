package builder;

public class Data {
    private String name;
    private int age;

    public Data(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
