package co.edu.uniquindio.preparcial.model;

public class Atraccion {
    String nombre;
    String descripcion;
    int edadMaxima;
    int edadMinima;
    String nivelPeligr;
    double pesoMaximo;

    public Atraccion(String nombre, String descripcion, int edadMaxima, int edadMinima, String nivelPeligr, double pesoMaximo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.edadMaxima = edadMaxima;
        this.edadMinima = edadMinima;
        this.nivelPeligr = nivelPeligr;
        this.pesoMaximo = pesoMaximo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getNivelPeligr() {
        return nivelPeligr;
    }

    public void setNivelPeligr(String nivelPeligr) {
        this.nivelPeligr = nivelPeligr;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

}
