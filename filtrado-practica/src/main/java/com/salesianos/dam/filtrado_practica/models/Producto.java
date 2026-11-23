package com.salesianos.dam.filtrado_practica.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import lombok.NoArgsConstructor;

import java.util.*;

@NoArgsConstructor
public class Producto {

    @Id @GeneratedValue
    private Long id;
    @Max(100)
    private String nombre;
    
    private List<Marca> marcas = new ArrayList<>();


}
