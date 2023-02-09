package com.diego.Repaso;

import com.diego.Repaso.model.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServiceImplementation implements AlumnoService
{

    @Autowired
    AlumnoRepository ar;

    @Override
    public List<Alumno> findAll()
    {
        return (List<Alumno>)ar.findAll();
    }

    @Override
    public Optional<Alumno> findById(Long id)
    {
        return ar.findById(id);
    }

    @Override
    public void save(Alumno a)
    {
        ar.save(a);
    }

    @Override
    public Alumno update(Long id, Alumno a)
    {
        if(ar.findById(id).isPresent())
            ar.save(a);
        return a;
    }

    @Override
    public void deleteById(Long id)
    {
        ar.deleteById(id);
    }
}
