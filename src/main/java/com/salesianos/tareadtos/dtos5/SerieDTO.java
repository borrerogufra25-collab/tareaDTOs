package com.salesianos.tareadtos.dtos5;

import com.salesianos.tareadtos.model5.Serie;

public record SerieDTO(
    String titulo,
    Integer temporadas,
    String creador,
    String categoria,
    String imagenPrincipal
) {

    public static SerieDTO fromSerie(Serie s) {
        String nombreCreador = null;
        String nombreCategoria = null;
        String imagenPrincipal = null;

        if (s == null) {
            return null;
        }

        if (s.getCreador() != null) {
            nombreCreador = s.getCreador().getNombre()
                + " "
                + s.getCreador().getApellidos();
        }

        if (s.getCategoria() != null) {
            nombreCategoria = s.getCategoria().getNombre();
        }

        if (s.getImagenes() != null
            && !s.getImagenes().isEmpty()) {

            imagenPrincipal = s.getImagenes().get(0);
        }


        return new SerieDTO(
            s.getTitulo(),
            s.getNumeroTemporadas(),
            nombreCreador,
            nombreCategoria,
            imagenPrincipal
        );
    }
}
