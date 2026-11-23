package com.salesianos.dam.filtrado_practica.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String nombre;

    private List<String> marcas= new ArrayList<>();


}
