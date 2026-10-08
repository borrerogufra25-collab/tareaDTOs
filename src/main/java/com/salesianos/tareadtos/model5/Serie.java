package com.salesianos.tareadtos.model5;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Serie {

  @Id
  @GeneratedValue
  private Long id;

  private String titulo;
  private String sinopsis;
  private Integer numeroTemporadas;

  private Creador creador;
  private Categoria categoria;

  private List<String> imagenes;
}