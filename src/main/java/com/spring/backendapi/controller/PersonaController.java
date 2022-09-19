package com.spring.backendapi.controller;


import com.spring.backendapi.entities.Persona;
import com.spring.backendapi.model.Response;
import com.spring.backendapi.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping
    public ResponseEntity<Persona> registrar(@Valid @RequestBody Persona persona){

        return new ResponseEntity<Persona>(personaService.registrar(persona), HttpStatus.CREATED);

    }

    @GetMapping
    public List<Persona> obtenerPersonas(){
        return personaService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> obtenerPersona(@PathVariable Long id) {
        return new ResponseEntity<>(personaService.findByPersonaId(id),HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Persona> actualizar(@PathVariable Long id, @RequestBody @Valid Persona persona) {
        persona.setId(id);
        return new ResponseEntity<>(personaService.actualizar(persona),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> eliminar(@PathVariable Long id) {
        personaService.eliminar(id);
        return new ResponseEntity<>(new Response("se elimino correctamente"),HttpStatus.OK);
    }

}
