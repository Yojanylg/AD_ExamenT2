package com.examen.CentroEscolar.model;


import jakarta.persistence.*;

@Entity
@Table(name = "aula")
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_aula;

    @Column
    private String nombre;

    @Column
    private int capacidad;

    @OneToOne(mappedBy = "aula")
    private Curso curso;

    public Aula() {
    }

    public Aula(int id_aula, String nombre, int capacidad, Curso curso) {
        this.id_aula = id_aula;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.curso = curso;
    }

    public Aula(String nombre, int capacidad, Curso curso) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.curso = curso;
    }

    public int getId_aula() {
        return id_aula;
    }

    public void setId_aula(int id_aula) {
        this.id_aula = id_aula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
