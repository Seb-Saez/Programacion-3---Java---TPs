package U1_tp2_toString;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("BBDD", "Prof. Leonardo Gomez");
        curso1.agregarEstudiante(new Estudiante("Juan", 20, "Ingenieria en Sistemas"));
        curso1.agregarEstudiante(new Estudiante("Maria", 22, "Diseño Grafico"));
        curso1.agregarEstudiante(new Estudiante("Pedro", 21, "Medicina"));

        Curso curso2 = new Curso("Programacion", "Prof. Neyen bianchi");
        curso2.agregarEstudiante(new Estudiante("Ana", 23, "Ingenieria Industrial"));
        curso2.agregarEstudiante(new Estudiante("Luis", 24, "Contabilidad"));

        System.out.println(curso1);
        System.out.println("--------------");
        System.out.println(curso2);

    }
}
