package com.examen.CentroEscolar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_alumno;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;

    @Column
    private String email;

    @ManyToOne(cascade =  CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_curso")
    private Curso curso;

    public Alumno() {
    }

    public Alumno(int id_alumno, String nombre, String apellido, String fechaNacimiento, String email, Curso curso) {
        this.id_alumno = id_alumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.curso = curso;
    }

    public Alumno(String nombre, String apellido, String fechaNacimiento, String email, Curso curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.curso = curso;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
