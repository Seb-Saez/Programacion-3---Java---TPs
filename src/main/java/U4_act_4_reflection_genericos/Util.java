package U4_act_4_reflection_genericos;

import java.util.List;

public class Util {

    // metodo que solo imprime los elementos de una lista
    public static <T> void imprimirLista(List<T> lista){
        for ( T e : lista){
            System.out.println(e);
        }
    }
}
