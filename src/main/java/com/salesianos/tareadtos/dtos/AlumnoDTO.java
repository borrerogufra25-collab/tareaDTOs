package com.salesianos.tareadtos.dtos;

import com.salesianos.tareadtos.model.Alumno;


public record AlumnoDTO(
        String name,
        String apellidos ,
        String email,
        String curso,
        String direccion
) {


    public static AlumnoDTO of(Alumno a) {

        return new AlumnoDTO(
                a.getNombre(),

                a.getEmail(),
                a.getCurso(),
                a.getDireccion()
        );
    }


}