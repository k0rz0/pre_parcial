package co.edu.uniquindio.preparcial.ejercicio1;

import co.edu.uniquindio.preparcial.model.Curso;
import co.edu.uniquindio.preparcial.model.Docente;
import co.edu.uniquindio.preparcial.model.Estudiante;

public class Main {
    public static void main(String[] args) {

        Curso curso;

        curso = InicializarDatosPrueba();

        System.out.println(curso.obtenerPromedioCurso());

    }

    private static Curso InicializarDatosPrueba() {

        Curso curso = new Curso("Programación1",2,"02N",3,"Nocturna");

        Estudiante estudiante1 = new Estudiante("Leonardo",26,"leo@email.com",2,4.3,4.5,5.0);
        Estudiante estudiante2 = new Estudiante("Angie",24,"Angie@email.com",1,3.0,4.0,5.0);
        Estudiante estudiante3 = new Estudiante("Veronica",25,"Veronica@email.com",2,3.7,3.8,3.9);

        Docente docente = new Docente("Lee",36,"Lee@email.com");

        curso.setEstudiante1(estudiante1);
        curso.setEstudiante2(estudiante2);
        curso.setEstudiante3(estudiante3);
        curso.setDocente(docente);

        return curso;
    }
}
