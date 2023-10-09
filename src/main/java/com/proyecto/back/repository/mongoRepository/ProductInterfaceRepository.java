package com.proyecto.back.repository.mongoRepository;

import com.proyecto.back.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductInterfaceRepository extends MongoRepository<Product,String> {

    Optional<Product> findByReference(String reference);
}
