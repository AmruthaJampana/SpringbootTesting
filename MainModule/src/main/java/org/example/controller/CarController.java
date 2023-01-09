package org.example.controller;


import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.example.model.Car;
import org.example.service.CarService;
import org.springframework.web.bind.annotation.*;

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
     @PutMapping("/car/{id}")
    public Car put(@RequestBody Car car , @PathVariable("id") String id) {

        return carService.put( car , id);

    }
    @GetMapping("/car/{id}")
    public Car getById(@PathVariable("id") String id){
        return carService.get(id);
    }

}
