package com.diego.Repaso.controller;

import com.diego.Repaso.AlumnoServiceImplementation;
import com.diego.Repaso.model.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController
{
    @Autowired
    private AlumnoServiceImplementation asi;

    @GetMapping("/lista")
    public List<Alumno> findAll()
    {
        return asi.findAll();
    }

    @PostMapping("/guarda")
    public void save(Alumno a)
    {
        asi.save(a);
    }

    @PutMapping("/modifica/{id}")
    public Alumno update(@PathVariable Long id, Alumno a)
    {
        return asi.update(id,a);
    }

    @DeleteMapping("/elimina/{id}")
    public void delete(@PathVariable Long id)
    {
        asi.deleteById(id);
    }
}
