package U4_act_3_reflection_genericos;

import java.util.ArrayList;
import java.util.List;

public class MainSinGenericos {
    public static void main(String[] args) {
        List lista = new ArrayList<>();
        lista.add("Hola soy un string");
        lista.add(46);

        // El problema que nos genera no usar genericos es que debemos castear los elementos cuando los queremos usar
        String texto = (String) lista.get(0);
        System.out.println(texto);
    }
}
