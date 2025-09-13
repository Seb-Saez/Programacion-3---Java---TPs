package U1_act4y5_equals_hashcode;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class Producto {
    private String codigo;
    private String nombre;
    private int precio;

    public Producto(String codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    // toString
  /*  @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }*/

    @Override
    public String toString(){
        return "Producto: " +
                "{ Codigo: " + codigo +
                " Nombre: " + nombre +
                " Precio: " + precio + " }";
    }



    // equals y hashcode

    @Override
    public boolean equals(Object o){
        // si tienen misma dir de mem, entonces son iguales, si son de clases diff son distintos
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producto product = (Producto) o;
        return Objects.equals(codigo, product.codigo);

    }

    @Override
    public int hashCode(){
        return Objects.hashCode(codigo);
    }
}
