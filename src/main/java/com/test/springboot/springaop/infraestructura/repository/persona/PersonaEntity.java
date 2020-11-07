package com.test.springboot.springaop.infraestructura.repository.persona;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author pedro
 */
@Data
@Entity
@Table(name = "personas")
public class PersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String cedula;

}
