package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inscripcion {
    @Setter
    private Alumno alumno;
    private List <Materia> materiasAInscribir;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasAInscribir = new ArrayList<>();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public List<Materia> getMateriasAInscribir() {
        return materiasAInscribir;
    }

    public void agregarMateriasAInscribir(Materia materia) {
        this.materiasAInscribir.add(materia);
    }

    public Boolean aprobada() {
        return this.materiasAInscribir.stream()
                .flatMap(materia -> obtenerTodasLasCorrelativas(materia).stream())
                .distinct()
                .allMatch(materia -> this.alumno.aprobo(materia));
    }

    public List<Materia> obtenerTodasLasCorrelativas(Materia materia) {
        List <Materia> correlativas = new ArrayList<>(materia.getCorrelativas());

        materia.getCorrelativas().forEach(materiaCorrelativa -> {
            correlativas.addAll(obtenerTodasLasCorrelativas(materiaCorrelativa));
        });
        return correlativas;
    }
}