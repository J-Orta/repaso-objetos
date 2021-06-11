package uaslp.objetos.escuela;

public class SalaDeJuntas {

    private String name;

    private SalaDeJuntas(String name){
        this.name = name;
    }

    public String getNombre(){
        return name;
    }

    public static SalaDeJuntas getInstance(String name){
        return new SalaDeJuntas(name);
    }
}
