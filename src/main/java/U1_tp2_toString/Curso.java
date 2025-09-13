package U1_tp2_toString;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Curso {
    private String nombre;
    private String profesor;
    private List<Estudiante> listaDeEstudiantes;

    public Curso(String nombre, String profesor){
        this.nombre = nombre;
        this.profesor = profesor;
        this.listaDeEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e){
        listaDeEstudiantes.add(e);
    }

    @Override
    public String toString(){
        return "Curso: " + nombre + "\n" +
                "Profesor: " + profesor + "\n" +
                "Cantidad de alumnos: " + listaDeEstudiantes.size() + "\n" +
                "Listado: " + listaDeEstudiantes;
    }

}
