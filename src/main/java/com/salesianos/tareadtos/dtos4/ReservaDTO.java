package com.salesianos.tareadtos.dtos4;

import com.salesianos.tareadtos.model4.Reserva;

public record ReservaDTO(
    String codigo,
    String cliente,
    String habitacion,
    Integer numeroNoches,
    Double precioTotal
) {

  public static ReservaDTO of(Reserva r) {

    String nombreCliente = null;
    String descHabitacion = null;
    Double precioTotal = null;

    if (r == null) {
      return null;
    }

    if (r.getCliente() != null) {
      nombreCliente = r.getCliente().getNombre()
          + " "
          + r.getCliente().getApellidos();
    }

    if (r.getHabitacion() != null) {
      descHabitacion = r.getHabitacion().getNumero()
          + " / "
          + r.getHabitacion().getTipo();
    }

    if (r.getNumeroNoches() != null
        && r.getHabitacion() != null
        && r.getHabitacion().getPrecioNoche() != null
    ) {
      precioTotal = r.getNumeroNoches() * r.getHabitacion().getPrecioNoche();
    }

    return new ReservaDTO(
        r.getCodigo(),
        nombreCliente,
        descHabitacion,
        r.getNumeroNoches(),
        precioTotal
    );
  }
}
