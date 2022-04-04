package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;


import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {


    @GetMapping( "/cars")
    public String Cars(ModelMap model, @RequestParam(defaultValue = "5")  int count) {
        List <Car> list = new ArrayList<>();
        list.add(new Car("car1", 1,2021));
        list.add(new Car("car2", 2,2022));
        list.add(new Car("car3", 3,2023));
        list.add(new Car("car4", 4,2024));
        list.add(new Car("car5", 5,2025));
        model.addAttribute("cars", list);

        if (count < 5) {
            model.addAttribute("cars", list.subList(0, count));
        }

        return "car";
    }
}
