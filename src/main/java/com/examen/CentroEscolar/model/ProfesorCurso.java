package com.examen.CentroEscolar.model;


import jakarta.persistence.*;

@Entity
@Table(name = "profesor_curso")
public class ProfesorCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ProfesorCurso() {
    }

    public ProfesorCurso(int id, Profesor profesor, Curso curso) {
        this.id = id;
        this.profesor = profesor;
        this.curso = curso;
    }

    public ProfesorCurso(Profesor profesor, Curso curso) {
        this.profesor = profesor;
        this.curso = curso;
    }
}
