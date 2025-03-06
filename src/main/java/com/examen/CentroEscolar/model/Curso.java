package com.examen.CentroEscolar.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_curso;

    @Column
    private String nombre;

    @OneToOne
    @JoinColumn(name = "id_aula")
    private Aula aula;

    @OneToMany(mappedBy = "curso", fetch = FetchType.EAGER)
    private List<Alumno> alumnos;

    @ManyToMany(mappedBy = "cursos", fetch = FetchType.EAGER)
    private List<Profesor> profesores;

    public Curso() {
    }

    public Curso(int id_curso, String nombre, Aula aula, List<Alumno> alumnos, List<Profesor> profesores) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.aula = aula;
        this.alumnos = alumnos;
        this.profesores = profesores;
    }

    public Curso(String nombre, Aula aula, List<Alumno> alumnos, List<Profesor> profesores) {
        this.nombre = nombre;
        this.aula = aula;
        this.alumnos = alumnos;
        this.profesores = profesores;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
}

