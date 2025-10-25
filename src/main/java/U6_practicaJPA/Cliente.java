package U6_practicaJPA;

import java.util.List;

public class Cliente {
    private Long id;
    private String nombre;
    private int edad;

    private List<Pedido> pedido;
    private Direccion direccion;
}
