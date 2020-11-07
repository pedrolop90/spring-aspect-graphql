package com.test.springboot.springaop.infraestructura.controller.persona.graphql;

import lombok.Data;

/**
 * @author pedro
 */
@Data
public class PersonaDto {

    private Long id;
    private String nombre;
    private String cedula;

}
