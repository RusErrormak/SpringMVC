package service;

import models.Car;
import java.util.List;

public interface CarService {

    public List<Car> carsList();
    public List<Car> getCars(int count);
}