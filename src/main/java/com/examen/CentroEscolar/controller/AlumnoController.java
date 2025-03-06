package com.examen.CentroEscolar.controller;

import com.examen.CentroEscolar.model.Alumno;
import com.examen.CentroEscolar.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @PostMapping("add")
    public String addAlumno(@RequestBody Alumno alumno){
        alumnoService.agregarAlumno(alumno);
        return "Alumno agregado correctamente " + alumno.getNombre();
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Alumno>> getAllAlumnos(){
        List<Alumno> lista = alumnoService.obtenerTodos();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("byCurso")
    public ResponseEntity<List<Alumno>> getByCurso(@RequestParam int idCurso){
        return new ResponseEntity<>(alumnoService.alumnosByCurso(idCurso), HttpStatus.OK);
    }

}
