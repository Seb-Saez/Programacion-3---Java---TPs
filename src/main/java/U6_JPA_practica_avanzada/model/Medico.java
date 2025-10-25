package U6_JPA_practica_avanzada.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Medico extends Base {

    private String nombre;
    private String apellido;
    private int edad;
    private String especialidad;
    private String matricula;

}
