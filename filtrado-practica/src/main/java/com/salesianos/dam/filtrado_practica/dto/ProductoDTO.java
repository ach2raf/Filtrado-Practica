package com.salesianos.dam.filtrado_practica.dto;

import java.util.List;

public class ProductoDTO {

    private Long id;
    private String nombre;
    private String marca;

    public ProductoDTO(String nombre, String marcas, Long id) {
        this.nombre = nombre;
        this.marca = marca;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public String getMarcas() {
        return marca;
    }
    public Long getId() {
        return id;
    }
}
