package U5_act_3_funcional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

}
