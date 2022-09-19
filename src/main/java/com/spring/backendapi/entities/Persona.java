package com.spring.backendapi.entities;

import lombok.Data;

import javax.persistence.*;


@Data @Entity @Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="persona_id", unique = true)
    private Long id;

    @Column(name ="persona_cedula", unique = true)
    private String cedula;

    @Column(name ="persona_nombre")

    private String nombre;

    @Column(name ="persona_apellidos")

    private String apellidos;

    @Column(name ="persona_telefono")

    private String telefono;


}
