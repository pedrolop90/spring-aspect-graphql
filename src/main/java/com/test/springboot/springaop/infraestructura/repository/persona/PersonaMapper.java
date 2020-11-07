package com.test.springboot.springaop.infraestructura.repository.persona;

import com.test.springboot.springaop.domain.model.persona.Persona;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.stream.Stream;

/**
 * @author pedro
 */
@Mapper(componentModel = "spring")
public interface PersonaMapper {

    @Named(value = "modelToEntity")
    PersonaEntity modelToEntity(Persona persona);

    @Named(value = "entityToModel")
    Persona entityToModel(PersonaEntity persona);

    @IterableMapping(qualifiedByName = "modelToEntity")
    Stream<PersonaEntity> modelToEntity(Stream<Persona> personas);

    @IterableMapping(qualifiedByName = "entityToModel")
    Stream<Persona> entityToModel(Stream<PersonaEntity> personas);
}
