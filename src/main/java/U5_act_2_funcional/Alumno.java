package U5_act_2_funcional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Alumno {
    private String nombre;
    private double nota;
    private String curso;



}
