package uaslp.objetos.escuela;

import java.util.ArrayList;

public class SalaDeJuntasFactory {

    private static ArrayList<SalaDeJuntas> salas = new ArrayList<>();

    public static SalaDeJuntas get(String name){

        SalaDeJuntas sala;

        for(int i = 0 ; i < salas.size() ; i++){
            sala = salas.get(i);

            if(sala.getNombre()==name) {
                return sala;
            }
        }

        salas.add(SalaDeJuntas.getInstance(name));
        return salas.get(salas.size()-1);
    }
}
