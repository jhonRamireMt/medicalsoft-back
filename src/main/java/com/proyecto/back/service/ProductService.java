package com.proyecto.back.service;

import com.proyecto.back.model.Product;
import com.proyecto.back.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /* METODO PARA GUARDAR UN PRODUCTO VALIDADO POR REFERENCIA*/
    public Product saveProduct(Product product){
        Optional<Product> validarReferencia = productRepository.findByReference(product.getReference());
        if(!validarReferencia.isPresent()){
            productRepository.saveProducto(product);
        }
        return null;
    }

    /* MOSTRAR PRODUCTOS*/
    public List<Product> getAllProducts(){
        return productRepository.getAllProducts();
    }

    public Product updateProduct(Product product){
        Optional<Product> validarReferencia = productRepository.findByReference(product.getReference());
        if(validarReferencia.isPresent()){
            productRepository.saveProducto(product);
        }
        return null;
    }
    public void deleteProduct(String reference){
        Optional<Product> validarExistencia = productRepository.findByReference(reference);
        if(validarExistencia.isPresent()){
            productRepository.deleteProduct(reference);
        }
    }

    public Optional<Product> findByReference(String ref){
        return productRepository.findByReference(ref);
    }
}
