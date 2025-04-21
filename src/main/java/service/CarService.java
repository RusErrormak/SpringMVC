package service;

import models.Car;
import java.util.List;

public interface CarService {

    public List<Car> getCars(int count);
}