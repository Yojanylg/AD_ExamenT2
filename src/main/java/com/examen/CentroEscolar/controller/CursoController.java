package com.examen.CentroEscolar.controller;

import com.examen.CentroEscolar.model.Curso;
import com.examen.CentroEscolar.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;


    @GetMapping("byAula")
    public Curso getByAula(@RequestParam int id_aula){
        return cursoService.getByAula(id_aula);
    }

    @GetMapping("byProfesor")
    public ResponseEntity<List<Curso>> byProfesor(@RequestParam int idProfesor){
        return new ResponseEntity<>(cursoService.getByProfesor(idProfesor), HttpStatus.OK);
    }

}
