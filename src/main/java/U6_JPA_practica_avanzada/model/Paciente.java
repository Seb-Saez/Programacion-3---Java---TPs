package U6_JPA_practica_avanzada.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Paciente extends Base {
    private String nombre;
    private String apellido;
    private int edad;

    @Column(unique = true)
    private int dni;
    private String obraSocial;
    private LocalDate fechaNacimiento;
    private char sexo;

    // la voy a comentar porque la estaba haciendo bilateral
    /*
    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Consulta> consultas = new ArrayList<>(); */

    @OneToOne(cascade = CascadeType.ALL)
    private HistoriaClinica historialClinico;

    @ManyToMany
    @JoinTable(
            name = "paciente_medicamento",
            joinColumns = @JoinColumn(name = "paciente_id"),
            inverseJoinColumns = @JoinColumn(name = "medicamento_id")
    )
    private List<Medicamento> medicamentos;


    public void setHistoriaClinica(HistoriaClinica hc2) {
    }
}
