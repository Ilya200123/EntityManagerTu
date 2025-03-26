package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CapService {

    private final CarDao carDao;

    public CarServiceImp(CarDao carDao) {this.carDao = carDao;}

    public List<Car> selectAllCars(int count) {return carDao.selectAllCars(count);}

}
