package com.test.springboot.springaop.infraestructura.controller.persona.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pedro
 */
@RestController
@RequestMapping("persona")
public class PersonaController {

    @GetMapping("/primero")
    public ResponseEntity<String> getPersonaPrimero() {
        return ResponseEntity.ok().body("primero");
    }

    @GetMapping("/segundo")
    public ResponseEntity<String> getPersonaSegundo() {
        return ResponseEntity.ok().body("segundo");
    }

}
