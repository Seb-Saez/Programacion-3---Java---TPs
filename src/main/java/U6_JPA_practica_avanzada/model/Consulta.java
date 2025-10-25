package U6_JPA_practica_avanzada.model;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Consulta extends Base {
    private LocalDate fecha;
    private String diagnostico;

    @ManyToOne
    private Medico medico;

    @ManyToOne
    private Paciente paciente;
}
