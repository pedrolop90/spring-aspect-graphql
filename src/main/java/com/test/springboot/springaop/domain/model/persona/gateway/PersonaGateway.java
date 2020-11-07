package com.test.springboot.springaop.domain.model.persona.gateway;

import com.test.springboot.springaop.domain.model.persona.Persona;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author pedro
 */
public interface PersonaGateway {

    Stream<Persona> getPersonas();

    Optional<Persona> insertPersona(Optional<Persona> persona);

}
