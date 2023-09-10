package co.edu.uniquindio.preparcial.model;
public class Visitante {
    String nombre;
    String apellidos;
    int edad;
    int identificacion;
    String tipoVisitante;
    String sexo;

    public Visitante(String nombre, String apellidos, int edad, int identificacion, String sexo, double peso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.identificacion = identificacion;

        if (edad >= 18){
            this.tipoVisitante = "adulto";
        } else if (edad >= 11 && edad <= 17) {
            this.tipoVisitante = "adolecente";
        } else if (edad >= 3 && edad <= 10) {
            this.tipoVisitante = "niño";
        }

        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoVisitante() {
        return tipoVisitante;
    }

    public void setTipoVisitante(String tipoVisitante) {
        this.tipoVisitante = tipoVisitante;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    double peso;

}
