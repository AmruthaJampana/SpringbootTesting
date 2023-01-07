package org.example.controller;


import lombok.AllArgsConstructor;
import org.example.model.Car;
import org.example.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CarController {

    private CarService carService;

    @PostMapping("/car")
    public Car create(@RequestBody Car car) {
        return carService.create(car);
    }
    @GetMapping("/car")
    public List<Car> find(){

        return carService.get();
    }

}
