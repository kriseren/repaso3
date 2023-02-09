package com.diego.Repaso;

import com.diego.Repaso.model.Alumno;

import java.util.List;
import java.util.Optional;

public interface AlumnoService
{
    //Método que busca todos los alumnos.
    List<Alumno> findAll();
    //Método que busca un alumno.
    Optional<Alumno> findById(Long id);
    //Método que inserta un alumno.
    void save(Alumno a);
    //Método que actualiza un alumno.
    Alumno update(Long id,Alumno a);
    //Método que elimina un alumno.
    void deleteById(Long id);
}
