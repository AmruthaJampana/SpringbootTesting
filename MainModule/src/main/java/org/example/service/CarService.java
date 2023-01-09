package org.example.service;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.example.model.Car;
import org.example.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Car put(Car car , String id){
        Optional<Car> existingOptional =  carRepository.findById(new ObjectId(id));
        if(existingOptional.isPresent()){
           Car existingCar = existingOptional.get();
           existingCar.setCompany(car.getCompany());
           existingCar.setYear(car.getYear());
           existingCar.setModel(car.getModel());
           return carRepository.save(existingCar);
        }
        return null;
    }

    public Car get(String id) {
        Optional<Car> existingOptional = carRepository.findById(new ObjectId(id));
        if (existingOptional.isPresent()) {
            return existingOptional.get();
        }
        return null;
    }


    }



