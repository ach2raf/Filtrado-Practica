package com.salesianos.dam.filtrado_practica.service;

import com.salesianos.dam.filtrado_practica.dto.ProductoDTO;
import com.salesianos.dam.filtrado_practica.dto.ProductoFilterDTO;
import com.salesianos.dam.filtrado_practica.especificacion.ProductoSpecification;
import com.salesianos.dam.filtrado_practica.models.Producto;
import com.salesianos.dam.filtrado_practica.repositories.ProductoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.PredicateSpecification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Transactional(readOnly = true)
    public Page<ProductoDTO> buscarProductos(ProductoFilterDTO filtro, Pageable pageable) {
        PredicateSpecification<Producto> spec = ProductoSpecification.conFiltroDinamico(filtro);

        Page<Producto> paginaEntidades = productoRepository.findBy(spec, query -> query.page(pageable));

        return paginaEntidades.map(p -> new ProductoDTO(p.getId(), p.getNombre(), p.getMarca()));
    }
}