package Clases;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public boolean aprobada() {
        List<Materia> correlativas = materia.getCorrelativas();
        List<Materia> materiasAprobadas = alumno.getMateriasAprobadas();

        for (Materia correlativa : correlativas) {
            if (!materiasAprobadas.contains(correlativa)) {
                return false;
            }
        }

        return true;
    }
}