package U3_act_4_lombok_dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

}
