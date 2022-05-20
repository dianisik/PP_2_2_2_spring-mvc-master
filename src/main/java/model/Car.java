package model;

public class Car {
    private String brand;
    private String model;
    private int engine;

    public Car (){
    }

    public Car (String brand, String model, int engine) {

        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel (String model) {
        this.model = model;
    }
    public int getEngine() {
        return engine;
    }
    public void setEngine(int engine) {
        this.engine = engine;
    }



}
