package U3_act_2_lombok_dto;

import lombok.Builder;
import lombok.Data;

// usamos data y builder
@Data
@Builder

public class Usuario {
    private String id;
    private String nombre;
    private String email;
}
