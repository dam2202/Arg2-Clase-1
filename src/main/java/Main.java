import Clases.Alumno;
import Clases.Inscripcion;
import Clases.Materia;

public class Main {
    public static void main(String[] args) {
        // Crear materias
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia paradigmas = new Materia("Paradigmas de Programación");
        Materia disenoSistemas = new Materia("Diseño de Sistemas");

        // Establecer correlatividades
        paradigmas.agregarCorrelativa(algoritmos);
        disenoSistemas.agregarCorrelativa(paradigmas);

        // Crear alumno
        Alumno alumno = new Alumno("Juan Pérez", "12345678");

        // Aprobar Algoritmos y Paradigmas
        alumno.aprobarMateria(algoritmos);
        alumno.aprobarMateria(paradigmas);

        // Realizar inscripción
        Inscripcion inscripcion = new Inscripcion(alumno, disenoSistemas);

        // Obtener datos de la inscripción y del alumno
        String materiaInscripcion = inscripcion.getMateria().getNombre();
        String nombreAlumno = inscripcion.getAlumno().getNombre();
        String dniAlumno = inscripcion.getAlumno().getDni();

        // Verificar si la inscripción está aprobada
        if (inscripcion.aprobada()) {
            System.out.println("El alumno " + nombreAlumno + " con DNI " + dniAlumno +
                    " se ha inscrito en la materia " + materiaInscripcion + " (APROBADA)");
        } else {
            System.out.println("El alumno " + nombreAlumno + " con DNI " + dniAlumno +
                    " intentó inscribirse en la materia " + materiaInscripcion +
                    " pero no cumple con las correlatividades");
        }
    }
}