package co.edu.uniquindio.preparcial.model;

public class Coche {
    String marca;
    String modelo;
    int anioFabricacion;
    double velocidadActual;
    boolean motorEncendido;
    double capacidadCombustible;
    String nivelCombustible;
    String color;
    boolean lucesEncendidas;
    boolean frenoDeManoActivado;
    int numeroPuertas;
    boolean aireAcondicionadoEncendido;
    boolean radioEncendido;
    boolean enMarcha;
    double kilometraje;

    public Coche(String marca, String modelo, int anioFabricacion, double velocidadActual, boolean motorEncendido,
                 double capacidadCombustible, String nivelCombustible, String color, boolean lucesEncendidas,
                 boolean frenoDeManoActivado, int numeroPuertas, boolean aireAcondicionadoEncendido,
                 boolean radioEncendido, boolean enMarcha, double kilometraje) {

        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.velocidadActual = velocidadActual;
        this.motorEncendido = false;
        this.capacidadCombustible = capacidadCombustible;
        this.nivelCombustible = nivelCombustible;
        this.color = color;
        this.lucesEncendidas = lucesEncendidas;
        this.frenoDeManoActivado = frenoDeManoActivado;
        this.numeroPuertas = numeroPuertas;
        this.aireAcondicionadoEncendido = true;
        this.radioEncendido = true;
        this.enMarcha = true;
        this.kilometraje = kilometraje;
    }

    public void desactivarAireAcondicionado(){
        this.aireAcondicionadoEncendido = true;
    }

    public void acelerar(){
        
    }
}
