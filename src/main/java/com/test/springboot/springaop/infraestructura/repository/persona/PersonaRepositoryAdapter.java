package com.test.springboot.springaop.infraestructura.repository.persona;

import com.test.springboot.springaop.domain.model.persona.Persona;
import com.test.springboot.springaop.domain.model.persona.gateway.PersonaGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author pedro
 */
@Repository
@RequiredArgsConstructor
public class PersonaRepositoryAdapter implements PersonaGateway {

    private final PersonaRepository repository;
    private final PersonaMapper mapper;

    @Override
    public Stream<Persona> getPersonas() {
        Stream<PersonaEntity> personaEntityStream = repository.findAll().stream();
        return mapper.entityToModel(personaEntityStream);
    }

    @Override
    public Optional<Persona> insertPersona(Optional<Persona> persona) {
        PersonaEntity personaEntity = mapper.modelToEntity(persona.orElse(null));
        repository.save(personaEntity);
        return Optional.of(
                mapper.entityToModel(personaEntity)
        );
    }
}
