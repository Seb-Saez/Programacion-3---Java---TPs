package U4_act_4_reflection_genericos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // lista de numeros
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(3);
        listaEnteros.add(67);
        listaEnteros.add(45);
        listaEnteros.add(22);
        listaEnteros.add(50);

        // imprimimos la lista
        System.out.println("--- Lista de num enteros: ");
        Util.imprimirLista(listaEnteros);

        // lista de strings
        List<String> listaStrings = new ArrayList<>();
        listaStrings.add("Hola");
        listaStrings.add("soy");
        listaStrings.add("una");
        listaStrings.add("lista");
        listaStrings.add("de");
        listaStrings.add("strings");

        System.out.println("--- Lista de strings: ");
        Util.imprimirLista(listaStrings);


    }
}
