package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private final List<Car> cars;

    public CarDaoImp() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 2020));
        cars.add(new Car("BMW", "X5", 2019));
        cars.add(new Car("Audi", "A4", 2021));
        cars.add(new Car("Tesla", "Model S", 2022));
        cars.add(new Car("Ford", "Mustang", 2018));

    }

    @Override
    public List<Car> selectAllCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        if (count >=5){
            return cars;
        }else {
            return cars.subList(0, count);
        }
    }
}
