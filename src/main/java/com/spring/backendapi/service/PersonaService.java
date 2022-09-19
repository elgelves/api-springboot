package com.spring.backendapi.service;

import com.spring.backendapi.entities.Persona;

import java.util.List;


public interface PersonaService {

   Persona registrar(Persona persona);

   List<Persona> listarTodos();

   Persona actualizar(Persona persona);

   void eliminar(Long id);
   Persona findByPersonaId(Long id);


}
