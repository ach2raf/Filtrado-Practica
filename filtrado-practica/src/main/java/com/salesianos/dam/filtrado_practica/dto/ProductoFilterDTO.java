package com.salesianos.dam.filtrado_practica.dto;

import java.util.List;

public class ProductoFilterDTO {

    private String nombre;
    private List<String>marcas;

    public ProductoFilterDTO() {}

    public ProductoFilterDTO(String nombre, List<String> marcas) {
        this.nombre = nombre;
        this.marcas = marcas;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<String> getMarcas() { return marcas; }
    public void setMarcas(List<String> marcas) { this.marcas = marcas; }

}
