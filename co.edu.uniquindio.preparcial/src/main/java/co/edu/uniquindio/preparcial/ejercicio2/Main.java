package co.edu.uniquindio.preparcial.ejercicio2;

import co.edu.uniquindio.preparcial.model.Atraccion;
import co.edu.uniquindio.preparcial.model.Visitante;

public class Main {
    public static void main(String[] args) {

        /* Instanciar objetos */

        Visitante visitante1 = new Visitante("Maria", "Montoya", 70, 12345, "F", 45.0);
        Visitante visitante2 = new Visitante("Laura", "Arias", 16, 123456, "F", 80.7);
        Visitante visitante3 = new Visitante("Manuel", "Gonzales", 18, 1234567, "M", 60.5);

        Atraccion atraccion1 = new Atraccion("Ciclon", "", 71, 5, "Bajo", 150.0);
        Atraccion atraccion2 = new Atraccion("Montaña Rusa", "", 50, 15, "Alto", 81.0);
        Atraccion atraccion3 = new Atraccion("Cumbre", "", 60, 12, "Medio", 60.0);

        System.out.println("El visitante1 puede subir a las siguientes atracciones: \n"+ verificarEdad(visitante1.getEdad(), atraccion1, atraccion2, atraccion3));
        System.out.println("El visitante2 puede subir a las siguientes atracciones: \n"+ verificarEdad(visitante2.getEdad(), atraccion1, atraccion2, atraccion3));
        System.out.println("El visitante3 puede subir a las siguientes atracciones: \n"+ verificarEdad(visitante3.getEdad(), atraccion1, atraccion2, atraccion3));

        double pesototal = 0;

        pesototal = subirVisitante(visitante1, atraccion1, pesototal);

        pesototal = subirVisitante(visitante2, atraccion1, pesototal);

        pesototal = subirVisitante(visitante3, atraccion1, pesototal);
    }


    public static String verificarEdad(int edadVisitante, Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccion3) {
        String atracciones = "";

        if (edadVisitante >= atraccion1.getEdadMinima() && edadVisitante <= atraccion1.getEdadMaxima()) {
            atracciones += atraccion1.getNombre();
        }
        if (edadVisitante >= atraccion2.getEdadMinima() && edadVisitante <= atraccion2.getEdadMaxima()) {
            atracciones += ", " + atraccion2.getNombre();
        }
        if (edadVisitante >= atraccion3.getEdadMinima() && edadVisitante <= atraccion3.getEdadMaxima()) {
            atracciones += ", " + atraccion3.getNombre();
        }
            return atracciones;
    }

    public static double subirVisitante(Visitante visitante, Atraccion atraccion, double pesoTotal){

        pesoTotal += visitante.getPeso();

        if (visitante.getEdad() <= atraccion.getEdadMinima() && visitante.getEdad() >= atraccion.getEdadMaxima()){
            System.out.println("El visitante no puede subir a esta atraccion ya que no cumple el requisito de edad");
        } else if (pesoTotal > atraccion.getPesoMaximo()) {
            System.out.println("El visitante no puede subir a esta atraccion ya que se supera el peso maximo");
        }else{
            System.out.println("El visitante se subio a esta atraccion 🎢");
        }

        return pesoTotal;
    }
}
