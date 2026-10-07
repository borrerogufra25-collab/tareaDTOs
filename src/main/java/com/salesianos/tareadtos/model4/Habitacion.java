package com.salesianos.tareadtos.model4;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Habitacion {

    @Id
    @GeneratedValue
    Long id;

    String numero;
    String tipo;
    Double precioNoche;
    Integer planta;
}
