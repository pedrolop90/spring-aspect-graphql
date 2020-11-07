package com.test.springboot.springaop.infraestructura.controller.persona.graphql;

import com.test.springboot.springaop.domain.model.persona.Persona;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.stream.Stream;

/**
 * @author pedro
 */
@Mapper(componentModel = "spring")
public interface PersonaDtoMapper {

    @Named(value = "dtoToModel")
    Persona dtoToModel(PersonaDto persona);

    @Named(value = "modelToDto")
    PersonaDto modelToDto(Persona persona);

    @IterableMapping(qualifiedByName = "dtoToModel")
    Stream<Persona> dtoToModel(Stream<PersonaDto> personas);

    @IterableMapping(qualifiedByName = "modelToDto")
    Stream<PersonaDto> modelToDto(Stream<Persona> personas);

}
