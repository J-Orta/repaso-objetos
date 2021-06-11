package uaslp.objetos.figuras;

import uaslp.objetos.Figura;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(){ }

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getBase(){
        return(base);
    }

    public double getAltura(){
        return(altura);
    }

    public double getArea(){

        if(base==0){
            throw new BaseNoProvistaException();
        }

        if (altura==0){
            throw new AlturaNoProvistaException();
        }
        return(base*altura/2);
    }

    @Override
    public String getName(){return("Triangulo");}

    public String getDescription(){return("Cualquier triangulo");}



}
