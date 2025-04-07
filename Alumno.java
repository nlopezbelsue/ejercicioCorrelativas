package org.example;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    @Setter
    private String nombre;
    @Setter
    private String apellido;
    @Setter
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, Integer legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void agregarMateriaAprobada(Materia materia) {
        this.materiasAprobadas.add(materia);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public Boolean aprobo(Materia materia) {
        return materiasAprobadas.contains(materia);
    }
}
