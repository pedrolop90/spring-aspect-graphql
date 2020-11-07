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
@Order(2)
public class PersonaAspectAfterGetterDeController {

    @Pointcut("execution(public * get*())")
    public void unGetCualquiera() {}

    @Pointcut("within(com.test.springboot.springaop.infraestructura.controller.persona.rest.*)")
    public void enController() {}

    @Pointcut("unGetCualquiera() && enController()")
    public void getDeController() {}

    @AfterReturning(
            pointcut = "getDeController()",
            returning = "valor")
    public void antesDeGetterDeController(Object valor) {
        System.out.println("aaaaaaaa" + "___" + valor.toString());
    }
}
