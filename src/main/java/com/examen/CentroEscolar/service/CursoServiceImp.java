package com.examen.CentroEscolar.service;

import com.examen.CentroEscolar.model.Curso;
import com.examen.CentroEscolar.model.Profesor;
import com.examen.CentroEscolar.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoServiceImp implements CursoService{

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Curso getByAula(int id_aula) {
        for (Curso c : cursoRepository.findAll()){
            if (c.getAula().getId_aula() == id_aula){
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Curso> getByProfesor(int id_profesor) {

        List<Curso> cursos = new ArrayList<>();
        for (Curso c : cursoRepository.findAll()){
            for (Profesor p : c.getProfesores()){
                if (p.getId_profesor() == id_profesor){
                    cursos.add(c);
                }
            }
        }

        return cursos;
    }

    @Override
    public Curso addCurso(Curso curso) {
        return cursoRepository.save(curso);
    }
}

