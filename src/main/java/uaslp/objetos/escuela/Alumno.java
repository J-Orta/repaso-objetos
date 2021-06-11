package uaslp.objetos.escuela;

import java.time.LocalDate;
import java.time.Month;

public class Alumno {

    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public static Builder builder(){
        return new Builder();
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public static class Builder {

        private Alumno alumno;

        private Builder(){
            this.alumno = new Alumno();
        }

        public Builder nombre(String nombre){
            this.alumno.nombre = nombre;
            return this;
        }

        public Builder clave(String clave){
            this.alumno.clave = clave;
            return this;
        }

        public Builder claveDeCarrera(String claveDeCarrera){
            this.alumno.claveDeCarrera = claveDeCarrera;
            return this;
        }

        public Builder anioDeIngreso(int anioDeIngreso){
            this.alumno.anioDeIngreso = anioDeIngreso;
            return this;
        }

        public Builder fechaNacimiento(java.time.LocalDate fecha){
            this.alumno.fechaNacimiento = fecha;
            return this;
        }

        public Alumno build(){
            return this.alumno;
        }
    }
}
