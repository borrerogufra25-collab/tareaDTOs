package com.salesianos.tareadtos;

import com.salesianos.tareadtos.dtos5.SerieDTO;
import com.salesianos.tareadtos.model5.Categoria;
import com.salesianos.tareadtos.model5.Creador;
import com.salesianos.tareadtos.model5.Serie;

import java.util.List;

public class MainDeMentira5 {

  public static void main(String[] args) {

    // Creador
    Creador creador = new Creador(
        1L,
        "Vince",
        "Gilligan",
        "Estados Unidos"
    );

    // Categoría
    Categoria categoria = new Categoria(
        1L,
        "Drama",
        "Series dramáticas"
    );

    // Lista de imágenes
    List<String> imagenes = List.of(
        "breakingbad1.jpg",
        "breakingbad2.jpg",
        "breakingbad3.jpg"
    );

    // 1. Serie completa
    Serie serie1 = new Serie(
        1L,
        "Breaking Bad",
        "Un profesor de química comienza a fabricar drogas.",
        5,
        creador,
        categoria,
        imagenes
    );

    System.out.println(
        SerieDTO.to(serie1)
    );

    // 2. Serie sin categoría
    Serie serie2 = new Serie(
        2L,
        "Otra serie",
        "Una serie de ejemplo.",
        3,
        creador,
        null,
        imagenes
    );

    System.out.println(
        SerieDTO.to(serie2)
    );

    // 3. Serie sin imágenes (lista null)
    Serie serie3 = new Serie(
        3L,
        "Serie sin imágenes",
        "Una serie sin imágenes.",
        2,
        creador,
        categoria,
        null
    );

    System.out.println(
        SerieDTO.to(serie3)
    );

    // 4. Serie con lista de imágenes vacía
    List<String> imagenesVacias = List.of();

    Serie serie4 = new Serie(
        4L,
        "Serie sin imágenes 2",
        "Una serie con una lista vacía.",
        1,
        creador,
        categoria,
        imagenesVacias
    );

    System.out.println(
        SerieDTO.to(serie4)
    );

    // 5. Serie null
    System.out.println(
        SerieDTO.to(null)
    );
  }
}