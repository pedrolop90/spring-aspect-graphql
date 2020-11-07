package com.test.springboot.springaop.infraestructura.aspect.persona;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author pedro
 */
@Component
@Aspect
@Order(1)
public class PersonaGraphqlAspectController {


    @Pointcut("within(com.test.springboot.springaop.infraestructura.controller.persona.graphql.Persona*Controller)")
    public void enController() {}

    @AfterReturning(
            pointcut = "enController()",
            returning = "valor")
    public void antesDeGetterDeController(Object valor) {
        System.out.println("ccccc" + "___" + valor.toString());
    }
}
