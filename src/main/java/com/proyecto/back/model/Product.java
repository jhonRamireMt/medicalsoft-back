package com.proyecto.back.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "product")
public class Product {

    @Id
    private String reference;
    private String name;
    private String category;
    private String speciality;
    private String description;
    private boolean availability = true;
    private double price;
    private Date date;
}
