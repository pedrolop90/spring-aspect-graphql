package com.test.springboot.springaop.infraestructura.controller.persona.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.test.springboot.springaop.aplicacion.persona.PersonaService;
import com.test.springboot.springaop.domain.model.persona.Persona;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.Optional;

/**
 * @author pedro
 */
@Controller
@RequiredArgsConstructor
public class PersonaMutationController implements GraphQLMutationResolver {

    private final PersonaService personaService;
    private final PersonaDtoMapper personaDtoMapper;

    public PersonaDto createPersona(PersonaDto personaDto) {
        Optional<Persona> persona = Optional
                .of(
                        personaDtoMapper.dtoToModel(personaDto)
                );
        Optional<Persona> personaResp = personaService.insertPersona(persona);
        return personaDtoMapper.modelToDto(personaResp.orElse(null));
    }

}
