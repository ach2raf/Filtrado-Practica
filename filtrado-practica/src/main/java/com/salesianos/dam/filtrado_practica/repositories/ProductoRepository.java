package com.salesianos.dam.filtrado_practica.repositories;

import com.salesianos.dam.filtrado_practica.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.*;

public interface ProductoRepository extends JpaRepository<Producto,Long>, JpaSpecificationExecutor<Producto>{




}
