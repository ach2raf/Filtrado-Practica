package com.salesianos.dam.filtrado_practica.especificacion;

import com.salesianos.dam.filtrado_practica.dto.ProductoFilterDTO;
import com.salesianos.dam.filtrado_practica.models.Producto;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.PredicateSpecification;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProductoSpecification {


    public static PredicateSpecification<Producto> conFiltroDinamico(ProductoFilterDTO filtro) {

        return (root, builder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (filtro.getNombre() != null && !filtro.getNombre().isBlank()) {
                predicates.add(builder.like(
                        builder.lower(root.get("nombre")),
                        "%" + filtro.getNombre().toLowerCase(Locale.ROOT) + "%"
                ));
            }

            if (filtro.getMarcas() != null && !filtro.getMarcas().isEmpty()) {
                predicates.add(root.get("marca").in(filtro.getMarcas()));
            }

            return builder.and(predicates.toArray(new Predicate[0]));

        };
    }
}

