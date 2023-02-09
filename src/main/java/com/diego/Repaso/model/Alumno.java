package com.diego.Repaso.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Entity(name = "alumnos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Alumno implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id= 1L;
    @Column
    private String nombre="Hola";
    @Column
    private int edad=19;
    @Column
    double notaMedia=9.2;
}
