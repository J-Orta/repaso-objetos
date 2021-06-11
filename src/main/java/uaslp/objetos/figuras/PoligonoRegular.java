package uaslp.objetos.figuras;

import uaslp.objetos.Figura;

public class PoligonoRegular extends Figura {

    private double lado;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados){

        if(numeroDeLados < 5){
            throw new NumeroInvalidoDeLados();
        }
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado){
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){return(lado);}

    public double getArea() {

        double perimetro = lado*numeroDeLados;
        double angulo =  Math.toRadians(360/(numeroDeLados*2));
        double apotema = lado / (2*Math.tan(angulo));

        return(perimetro*apotema/2);
    }

    @Override
    public String getName(){
        return("Poligono Regular");
    }
}
