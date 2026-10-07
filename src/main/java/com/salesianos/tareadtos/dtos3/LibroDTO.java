package com.salesianos.tareadtos.dtos3;

import com.salesianos.tareadtos.model3.Libro;

public record LibroDTO(
    String titulo,
    String isbn,
    String autor,
    Integer anioPublicacion
) {

    public static LibroDTO of(Libro l) {

        if (l == null) {
            return null;
        }

        return new LibroDTO(
            l.getTitulo(),
            l.getIsbn(),
            l.getAutor().nomAutor(),
            l.getAnioPublicacion()
        );
    }
}
