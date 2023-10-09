package com.proyecto.back.repository;

import com.proyecto.back.model.Product;
import com.proyecto.back.repository.mongoRepository.ProductInterfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    @Autowired
    private ProductInterfaceRepository productInterfaceRepository;

    public Product saveProducto(Product producto){
        return (Product) productInterfaceRepository.save(producto);
    }

    public List<Product> getAllProducts(){
        return (List<Product>) productInterfaceRepository.findAll();
    }

    public void deleteProduct(String reference){
        productInterfaceRepository.deleteById(reference);
    }

    public Optional<Product> findByReference(String reference){
        return productInterfaceRepository.findByReference(reference);
    }
}
