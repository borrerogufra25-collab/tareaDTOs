package com.salesianos.tareadtos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Direccion {

    @Id
    @GeneratedValue
    private Long id;
    private String tipoVia;
    private String linea1;
    private String linea2;
    private int cp;
    private String poblacion;
    private String provincia;


}
