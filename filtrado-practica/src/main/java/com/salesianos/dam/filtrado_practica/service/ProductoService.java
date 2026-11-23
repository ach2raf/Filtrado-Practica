package com.salesianos.dam.filtrado_practica.service;

import com.salesianos.dam.filtrado_practica.dto.ProductoDTO;
import com.salesianos.dam.filtrado_practica.dto.ProductoFilterDTO;
import com.salesianos.dam.filtrado_practica.models.Producto;
import com.salesianos.dam.filtrado_practica.repositories.ProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.PredicateSpecification;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

import com.salesianos.dam.filtrado_practica.repositories.ProductoRepository;
@Service

public class ProductoService {


    private final ProductoRepository productoRepository;

    @Transactional(readOnly = true)
    public Page<ProductoDTO> buscarProductos(ProductoFilterDTO filtro, Pageable pageable) {
         PredicateSpecification<Producto> spec = ProductoSpecifications.conFiltroDinamico(filtro);

        Page<Producto> paginaEntidades = productoRepository.findBy(spec, query -> query.page(pageable));

        return paginaEntidades.map(p -> new ProductoDTO(p.getId(), p.getNombre(), p.getMarca()));
    }
}

