package org.example.repository;

import org.bson.types.ObjectId;
import org.example.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends MongoRepository<Car, ObjectId> {



}
