package Clases;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String dni;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void aprobarMateria(Materia materia) {
        materiasAprobadas.add(materia);
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
}
