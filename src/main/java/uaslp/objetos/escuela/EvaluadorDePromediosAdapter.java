package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluadorDePromediosAdapter {

    EvaluadorDePromedios evaluador;
    List<Double> listaCalificaciones = new ArrayList<>();

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluador) {
        this.evaluador = evaluador;
    }

    public double evalua(String calificacion) {

        List<String> stringCalificaciones = Arrays.asList(calificacion.split(","));

        for (String calificacion1 : stringCalificaciones) {
            listaCalificaciones.add(Double.parseDouble(calificacion1));
        }
        return evaluador.evalua(listaCalificaciones);
    }

}