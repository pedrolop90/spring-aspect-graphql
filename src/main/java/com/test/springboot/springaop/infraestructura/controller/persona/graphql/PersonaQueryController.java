package com.test.springboot.springaop.infraestructura.controller.persona.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.test.springboot.springaop.aplicacion.persona.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pedro
 */
@Controller
@RequiredArgsConstructor
public class PersonaQueryController implements GraphQLQueryResolver {

    private final PersonaService personaService;
    private final PersonaDtoMapper personaDtoMapper;

    public List<PersonaDto> personas() {
        return personaDtoMapper
                .modelToDto(
                        personaService
                                .getPersonas()
                ).collect(Collectors.toList());
    }

}
