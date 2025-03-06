package com.examen.CentroEscolar.service;

import com.examen.CentroEscolar.model.Alumno;
import com.examen.CentroEscolar.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoServiceImp implements AlumnoService{

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Alumno agregarAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public List<Alumno> obtenerTodos() {
        return alumnoRepository.findAll();
    }

    @Override
    public List<Alumno> alumnosByCurso(int curso) {
        List<Alumno> lista = new ArrayList<>();

        for (Alumno a : alumnoRepository.findAll()){
            if (a.getCurso().getId_curso() == curso){
                lista.add(a);
            }
        }
        return lista;
    }
}
