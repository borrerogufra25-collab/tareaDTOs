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
public class Curso {

    @Id
    @GeneratedValue
    private Long Id;
    private String nombre;
    private String tipo;
    private String tutor;
    private String aula;
}
