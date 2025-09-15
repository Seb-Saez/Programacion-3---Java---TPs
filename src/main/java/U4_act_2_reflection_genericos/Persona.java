package U4_act_2_reflection_genericos;

import lombok.Builder;
import lombok.Data;

@Data
//@Builder

public class Persona {
    private String nombre;
    private int edad;

    // agregar constructores a mano
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo(){
        System.out.println("Hola mi nombre es " + nombre + " y tengo una edad de: " + edad);
    }

    private String Saludar(){
        return "Hola";
    }
}
