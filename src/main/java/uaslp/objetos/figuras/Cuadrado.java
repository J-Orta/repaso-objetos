package uaslp.objetos.figuras;

import uaslp.objetos.Figura;


public class Cuadrado extends Figura  {

    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public Cuadrado(){

    }

    public double getLado(){
       return(lado);
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getArea(){
        if(lado == 0){
            throw new LadoNoProvistoException();
        }
        return(lado*lado);
    }

    @Override
    public String getName() {
        return("Cuadrado");
    }
}
