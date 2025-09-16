package U4_act_3_reflection_genericos;

public class Main {
    public static void main(String[] args) {

        // Caja String
        System.out.println("--- Imprimimos la caja String");
        Caja<String> cString = new Caja<>();
        cString.setContenido("Marron");
        System.out.println(cString);

        // caja int
        System.out.println("Imprimimos la caja integer");
        Caja<Integer> cInt = new Caja<>();
        cInt.setContenido(55);
        System.out.println(cInt);
    }
}
