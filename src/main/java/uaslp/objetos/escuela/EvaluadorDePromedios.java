package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.List;

public class EvaluadorDePromedios {

    public double evalua(List<Double> calificaciones){

        int sum = 0;

        for(int i=0; i < calificaciones.size() ; i++){
            sum += calificaciones.get(i);
        }

       // double sum = calificaciones.stream().reduce(0.0, Double::sum);

        return sum / calificaciones.size();
    }
}
