package com.test.springboot.springaop.aplicacion.persona;

import com.test.springboot.springaop.domain.model.persona.Persona;
import com.test.springboot.springaop.domain.usecase.PersonaCrudUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author pedro
 */
@Service
@RequiredArgsConstructor
public class PersonaService {

    private final PersonaCrudUseCase personaCrudUseCase;

    public Stream<Persona> getPersonas() {
        return personaCrudUseCase.getPersonas();
    }

    public Optional<Persona> insertPersona(Optional<Persona> persona) {
        return personaCrudUseCase.insertPersona(persona);
    }
}
