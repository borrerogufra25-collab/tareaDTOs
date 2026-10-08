package com.salesianos.tareadtos.model3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {

  @Id
  @GeneratedValue
  private Long id;
  private String titulo;
  private String isbn;
  private Integer anioPublicacion;
  private Integer numeroPaginas;

  private Autor autor;
}
