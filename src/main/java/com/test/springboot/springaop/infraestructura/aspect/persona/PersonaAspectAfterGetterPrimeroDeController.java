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
public class PersonaAspectAfterGetterPrimeroDeController {

    @Pointcut("within(com.test.springboot.springaop.infraestructura.controller.persona.rest.*)")
    public void enController() {}

    @Pointcut("execution(public * get*Primero())")
    public void unGetterPrimero() {}

    @Pointcut("unGetterPrimero() && enController()")
    public void getterDeControllerPrimero() {}

    @AfterReturning(
            pointcut = "getterDeControllerPrimero()",
            returning = "valor")
    public void log(Object valor) {
        System.out.println("bbbbbb" + "___" + valor.toString());
    }

}
