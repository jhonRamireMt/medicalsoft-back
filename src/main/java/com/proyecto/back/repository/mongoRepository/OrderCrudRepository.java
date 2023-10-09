package com.proyecto.back.repository.mongoRepository;

import com.proyecto.back.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface OrderCrudRepository extends MongoRepository<Order,Integer> {

    // RETORNA UNA LISTA DE ORDER DONDE EL SALESMAN COINCIDA CON LA ZONA BUSCADA
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String zone);

    // RETORNA ORDENES POR EL ESTADO
    @Query("{status: ?0}")
    List<Order> findByStatus(final String status);

    //Para seleccionar la orden con el id maximo
    Optional<Order> findTopByOrderByIdDesc();

}
