package com.examen.CentroEscolar.controller;

import com.examen.CentroEscolar.model.Curso;
import com.examen.CentroEscolar.model.Profesor;
import com.examen.CentroEscolar.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("profesores")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @PostMapping("add")
    public String addProfesor(@RequestBody Profesor profesor){
        profesorService.agregarProfesor(profesor);
        return "Profesor agregado correctamente " + profesor.getNombre();
    }

    @GetMapping("byCurso")
    public ResponseEntity<List<Profesor>> getByCursos(@RequestParam int id_curso){

        List<Profesor> lista = new ArrayList<>();

        for (Profesor profesor : profesorService.obtenerTodos()){
            for (Curso curso : profesor.getCursos()){
                if (curso.getId_curso() == id_curso){
                    lista.add(profesor);
                }
            }
        }

        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

}
