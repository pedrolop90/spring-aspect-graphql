package com.test.springboot.springaop.domain.usecase;

import com.test.springboot.springaop.domain.model.persona.Persona;
import com.test.springboot.springaop.domain.model.persona.gateway.PersonaGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author pedro
 */
@Component
@RequiredArgsConstructor
public class PersonaCrudUseCase {

    private final PersonaGateway personaGateway;

    public Stream<Persona> getPersonas() {
        return personaGateway.getPersonas();
    }

    public Optional<Persona> insertPersona(Optional<Persona> persona) {
        return personaGateway.insertPersona(persona);
    }


}
