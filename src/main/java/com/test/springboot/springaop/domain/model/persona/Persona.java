package com.test.springboot.springaop.domain.model.persona;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pedro
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    private Long id;
    private String nombre;
    private String cedula;

}
