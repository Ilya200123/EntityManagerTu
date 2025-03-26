package web.service;

import web.model.Car;

import java.util.List;

public interface CapService {
     List<Car> selectAllCars(int count);
}