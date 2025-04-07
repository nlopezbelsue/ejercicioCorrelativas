package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    @DisplayName("Test inscripcion aprobada")
    public void inscripcionAprobada() {
        Alumno alumno = new Alumno("Nicolas", "Lopez Belsue", 2090557);
//        alumno.setNombre("Nicolas");
//        alumno.setApellido("Lopez Belsue");
//        alumno.setLegajo(2090557);


        Materia algoritmos = new Materia("AyED", 1);
        Materia paradigmas = new Materia("PDeP", 2);
        Materia disenio = new Materia("DDSI", 3);


        Inscripcion inscripcionPrueba = new Inscripcion(alumno);
        inscripcionPrueba.agregarMateriasAInscribir(disenio);

        paradigmas.agregarMateriaCorrelativa(algoritmos);
        disenio.agregarMateriaCorrelativa(algoritmos);
        disenio.agregarMateriaCorrelativa(paradigmas);

        alumno.agregarMateriaAprobada(algoritmos);
        alumno.agregarMateriaAprobada(paradigmas);

        Assertions.assertEquals(true, inscripcionPrueba.aprobada());
    }
    @Test
    @DisplayName("Test inscripcion no aprobada")
    public void inscripcionNoAprobada() {
        Alumno alumno = new Alumno("Nicolas", "Lopez Belsue", 2090557);
//        alumno.setNombre("Nicolas");
//        alumno.setApellido("Lopez Belsue");
//        alumno.setLegajo(2090557);


        Materia algoritmos = new Materia("AyED", 1);
        Materia paradigmas = new Materia("PDeP", 2);
        Materia disenio = new Materia("DDSI", 3);


        Inscripcion inscripcionPrueba = new Inscripcion(alumno);
        inscripcionPrueba.agregarMateriasAInscribir(disenio);

        disenio.agregarMateriaCorrelativa(algoritmos);
        disenio.agregarMateriaCorrelativa(paradigmas);

        alumno.agregarMateriaAprobada(algoritmos);

        Assertions.assertEquals(false, inscripcionPrueba.aprobada());
    }

}