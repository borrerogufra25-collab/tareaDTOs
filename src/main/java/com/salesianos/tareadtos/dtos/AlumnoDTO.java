package com.salesianos.tareadtos.dtos;

import com.salesianos.tareadtos.model.Alumno;

public record AlumnoDTO(
    String name, String apellidos, String email, String curso, String direccion) {

    public static AlumnoDTO to(Alumno alumno) {
        String apellidos = alumno.getApellido1() + " " + alumno.getApellido2();

        String curso = alumno.getCurso() != null ? alumno.getCurso().getNombre() : "";

        String direccion =
            alumno.getDireccion().getTipoVia()
                + " "
                + alumno.getDireccion().getLinea1()
                + ", "
                + alumno.getDireccion().getCp()
                + " "
                + alumno.getDireccion().getPoblacion();

        return new AlumnoDTO(alumno.getNombre(), apellidos, alumno.getEmail(), curso, direccion);
    }

  /*  private static String formatearDireccion(Direccion direccion) {
      return "%s %s. CP %s %s (%s);".formatted(
          direccion.getTipoVia(),
          direccion.get
      )
  }*/

}
