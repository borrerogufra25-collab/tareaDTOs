package com.salesianos.tareadtos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Alumno {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;

    @ManyToOne
    @JoinColumn(name = "direccion_id")
    private Direccion direccion;
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;




}
