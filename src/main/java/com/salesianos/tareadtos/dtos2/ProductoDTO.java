package com.salesianos.tareadtos.dtos2;

import com.salesianos.tareadtos.model2.Categoria;
import com.salesianos.tareadtos.model2.Producto;

import java.util.List;

public record ProductoDTO(
    String nombre,
    double pvp,
    List<String> imagenes,
    Categoria categoria
) {

    public static ProductoDTO to(Producto producto) {

        return new ProductoDTO(
            producto.getNombre(),
            producto.getPvp(),
            producto.getImagenes(),
            producto.getCategoria()
        );
        
    }
}
