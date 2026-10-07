package com.salesianos.tareadtos;

import com.salesianos.tareadtos.dtos3.LibroDTO;
import com.salesianos.tareadtos.dtos4.ReservaDTO;
import com.salesianos.tareadtos.model3.Autor;
import com.salesianos.tareadtos.model3.Libro;
import com.salesianos.tareadtos.model4.Cliente;
import com.salesianos.tareadtos.model4.Habitacion;
import com.salesianos.tareadtos.model4.Reserva;

public class MainDeMentira {
    public static void main(String[] args) {

        // Ejercicio 3
        Autor autor1 = new Autor(
            1L,
            "Fran",
            "Borrero",
            "Guerrero",
            "Española"
        );

        Libro libro1 = new Libro(
            1L,
            "Rest es raro",
            "1234123412",
            2026,
            234,
            autor1
        );

        LibroDTO libroDTO = LibroDTO.of(libro1);

        System.out.println(libro1);

        // Ejercicio 4
        Cliente cliente = new Cliente(
            1L,
            "Fra",
            "Borrero Guerrero",
            "a@a.com",
            "123456789"
        );
        Habitacion habitacion = new Habitacion(
            1L,
            "200",
            "Doble",
            80.0,
            2
        );
        Reserva reserva1 = new Reserva(
            1L,
            "001",
            3,
            cliente,
            habitacion
        );
        ReservaDTO dto1 = ReservaDTO.of(reserva1);

        System.out.println(dto1);

        // 2. Reserva sin cliente
        Reserva reserva2 = new Reserva(
            2L,
            "RES-002",
            2,
            null,
            habitacion
        );

        System.out.println(
            ReservaDTO.of(reserva2)
        );


        // 3. Reserva sin habitación
        Reserva reserva3 = new Reserva(
            3L,
            "RES-003",
            2,
            cliente,
            null
        );

        System.out.println(
            ReservaDTO.of(reserva3)
        );


        // 4. Reserva sin número de noches
        Reserva reserva4 = new Reserva(
            4L,
            "RES-004",
            null,
            cliente,
            habitacion
        );

        System.out.println(
            ReservaDTO.of(reserva4)
        );


        // 5. Habitación sin precio
        Habitacion habitacionSinPrecio = new Habitacion(
            2L,
            "305",
            "Suite",
            null,
            3
        );

        Reserva reserva5 = new Reserva(
            5L,
            "RES-005",
            4,
            cliente,
            habitacionSinPrecio
        );

        System.out.println(
            ReservaDTO.of(reserva5)
        );


        // 6. Reserva null
        System.out.println(
            ReservaDTO.of(null)
        );

    }

}
