package Aula23;

import javax.annotation.processing.SupportedSourceVersion;

public class Instancia {
    private static int instancias = 0;
    private int id;

    public Instancia(){
        id = instancias++;
        System.out.println("Objeto.Objeto() [id=" + id + "]");
    }

    public static int getInstancias(){
        return instancias;
    }

    public int getId() {
        return id;
    }

    protected void finalize(){
        instancias--;
        System.out.println("Objeto.finalize() [id=" + id + "]");
    }

}
