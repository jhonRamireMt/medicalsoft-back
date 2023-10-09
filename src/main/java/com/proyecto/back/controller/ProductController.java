package com.proyecto.back.controller;

import com.proyecto.back.model.Product;
import com.proyecto.back.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAllProduct(){
        return productService.getAllProducts();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable String reference){
        productService.deleteProduct(reference);
    }

    @GetMapping("/{reference}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Product> getByRef(@PathVariable String reference){
        return productService.findByReference(reference);
    }
}
