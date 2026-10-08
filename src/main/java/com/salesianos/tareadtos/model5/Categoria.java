package com.salesianos.tareadtos.model5;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Categoria {

  @Id
  @GeneratedValue
  private Long id;

  private String nombre;
  private String descripcion;
}
