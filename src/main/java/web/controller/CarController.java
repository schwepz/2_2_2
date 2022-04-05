package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.service.CarService;


import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    @GetMapping( "/cars")
    public String Cars(ModelMap model, @RequestParam(defaultValue = "5")  int count) {
        model.addAttribute("cars", CarService.getList().subList(0, count));
        return "car";
    }


}
