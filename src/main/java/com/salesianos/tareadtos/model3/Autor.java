package com.salesianos.tareadtos.model3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autor {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String apellido1;
    private String apellido2;
    private String nacionalidad;

    public String nomAutor() {
        return name + " " + apellido1 + " " + apellido2;
    }
}
