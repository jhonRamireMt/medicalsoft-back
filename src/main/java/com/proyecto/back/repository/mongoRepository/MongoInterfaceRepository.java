package com.proyecto.back.repository.mongoRepository;

import com.proyecto.back.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface MongoInterfaceRepository extends MongoRepository<User,Integer> {

     Optional<User> findByEmail(String email);
     Optional<User> findByEmailAndPassword(String email,String password);
     //Para seleccionar el usuario con el id maximo
     Optional<User> findTopByOrderByIdDesc();
}
