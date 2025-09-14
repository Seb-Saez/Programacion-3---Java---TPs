package U3_act_2_lombok_dto;

public class Main {
    public static void main(String[] args) {
        // instanciamos un usuario con todos los atributos
        Usuario u1 = Usuario.builder()
                .id("u01")
                .nombre("Jorge")
                .email("Jorge@gmail.com")
                .build();
        System.out.println("Imprimimos el usuario con todos los atributos");
        System.out.println(u1);
        System.out.println("-----------------");

        Usuario u2 = Usuario.builder()
                .nombre("Martina")
                .email("marti@gmail.com")
                .build();

        System.out.println("imprimimos un usuario que le falte el ID");
        System.out.println(u2);

        Usuario u3 = Usuario.builder()
                .id("u03")
                .email("leo@gmail.com")
                .nombre("Leonardo")
                .build();

        System.out.println("Imprimimos un 3er usuario Leo");
        System.out.println(u3);



    }
}
