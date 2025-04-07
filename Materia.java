package org.example;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    @Setter
    private String nombre;
    @Setter
    private Integer idMateria;
    private List<Materia> correlativas;

    public Materia(String nombre, Integer idMateria) {
        this.nombre = nombre;
        this.idMateria = idMateria;
        this.correlativas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void agregarMateriaCorrelativa(Materia materia) {
        this.correlativas.add(materia);
    }
}
