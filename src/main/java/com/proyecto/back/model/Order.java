package com.proyecto.back.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;

@Document(collection = "order")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
//
//    public static String PENDING = "Pendiente";
//    public static String APROVED = "Aprobada";
//    public static String REJECTED = "Rechazada";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Date registerDay;
    private String status ="Pendiente";
    private User salesMan;
    private Map<String, Product> products;

}
