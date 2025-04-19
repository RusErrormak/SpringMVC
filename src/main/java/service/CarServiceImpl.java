package service;

import models.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    public List<Car> carsList() {
        cars.add(new Car("Nissan", "White", 34));
        cars.add(new Car("Mercedes", "Black", 321));
        cars.add(new Car("BMW", "yellow", 46));
        cars.add(new Car("Toyota", "green", 80));
        cars.add(new Car("Opel", "yellow", 301));
        return  cars;
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> allCars = carsList();
        if (count <= 0 || count >= 5) {
            return allCars;
        }
        return allCars.subList(0, Math.min(count, allCars.size()));
    }
}
