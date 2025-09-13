package U1_act2_toString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Estudiante> lista = new ArrayList<>();

        lista.add(new Estudiante("Juan", 20, "Ingenieria en Sistemas"));
        lista.add(new Estudiante("Maria", 22, "Diseño Grafico"));
        lista.add(new Estudiante("Pedro", 21, "Medicina"));

        System.out.println(lista);
    }
}