package web.service;

import org.springframework.stereotype.Service;
import web.Car;

import java.util.ArrayList;
import java.util.List;


public class CarService {

    public static List<Car> getList() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("car1", 1,2021));
        list.add(new Car("car2", 2,2022));
        list.add(new Car("car3", 3,2023));
        list.add(new Car("car4", 4,2024));
        list.add(new Car("car5", 5,2025));
        return list;
    }



}
