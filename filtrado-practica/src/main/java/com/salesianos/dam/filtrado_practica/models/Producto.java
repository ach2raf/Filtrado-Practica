package com.salesianos.dam.filtrado_practica.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Entity

public class Producto {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String nombre;

    private List<String> marcas= new ArrayList<>();


}
