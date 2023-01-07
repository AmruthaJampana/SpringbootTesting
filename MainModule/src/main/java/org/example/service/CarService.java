package org.example.service;

import lombok.AllArgsConstructor;
import org.example.model.Car;
import org.example.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {

    private CarRepository carRepository;

    public Car create(Car car) {

        return carRepository.save(car);
    }

    public List<Car> get(){

        return carRepository.findAll();
    }


}
