package com.salesianos.tareadtos.model2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Producto {

  @Id
  @GeneratedValue
  private Long id;

  private String nombre;
  private double desc;
  private double pvp;
  private List<String> imagenes;

  @ManyToOne
  private Categoria categoria;

}
