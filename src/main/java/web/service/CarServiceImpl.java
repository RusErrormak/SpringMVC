package web.service;

import web.models.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Nissan", "White", 34));
        cars.add(new Car("Mercedes", "Black", 321));
        cars.add(new Car("BMW", "yellow", 46));
        cars.add(new Car("Toyota", "green", 80));
        cars.add(new Car("Opel", "yellow", 301));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count <= 0 || count >= 5) {
            return cars;
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
