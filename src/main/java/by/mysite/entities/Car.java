package by.mysite.entities;

public class Car {
    private int id;
    private String model;
    private Engine engine;

    public Car(int id, String model, Engine engine) {
        this.id = id;
        this.model = model;
        this.engine = engine;
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Car() {
        model = "Default model";
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(int id, String model) {
        this.id = id;
        this.model = model;
    }
    public Car(String model, int id) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
