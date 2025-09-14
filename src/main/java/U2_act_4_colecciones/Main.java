package U2_act_4_colecciones;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Curso> cursos = new HashMap<>();

        Curso c1 = new Curso("Programacion 1", "Emi Martinez");
        Curso c2 = new Curso("Programacion 2", "Lisandro Matinez");
        Curso c3 = new Curso("Programacion 3", "Lionel Messi");
        Curso c4 = new Curso("Prgramacion 4", "Julian Alvarez");


        cursos.put("c101", c1);
        cursos.put("c102", c2);
        cursos.put("c103", c3);
        cursos.put("c104", c4);

        // buscar por lcave

        System.out.println("El curso recuperado por clave es: ");
        System.out.println(cursos.get("c102"));
        System.out.println("---------------");

        for (Map.Entry<String, Curso> entry : cursos.entrySet()){
            String codigo = entry.getKey();
            Curso curso = entry.getValue();
            System.out.println("Codigo " + codigo + " = " + curso);
        }


    }
}
