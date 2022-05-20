package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Ford", "Mondeo", 2));
        cars.add(new Car("Reno", "Megan", 1));
        cars.add(new Car("Lada", "Kalina", 1));
        cars.add(new Car("Volkswagen", "Golf", 2));
        cars.add(new Car("Hyundai", "Elantra", 3));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars;
    }
}
