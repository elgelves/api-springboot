package com.spring.backendapi.service.impl;


import com.spring.backendapi.entities.Persona;
import com.spring.backendapi.repositories.PersonaRepository;
import com.spring.backendapi.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona registrar(Persona persona) {

            return personaRepository.save(persona);
    }

    @Override
    public List<Persona> listarTodos() {
        return personaRepository.findAll();
    }

    @Override
    public Persona actualizar(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void eliminar(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findByPersonaId(Long id) {
        return personaRepository.findById(id).get();
    }

}
