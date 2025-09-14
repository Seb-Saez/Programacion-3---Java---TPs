package U2_act_3_colecciones;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Producto {
    private String codigo;
    private String descripcion;

    public Producto(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }


    // ahora sobreescribimos el equals y el hashcode

    @Override
    public boolean equals(Object obj){
        // primero valido si tiene el mismo objeto y doy true derecho
        if (this == obj) return true;
        // comparo las clases, si son distintas false directamente
        if (obj == null || getClass() != obj.getClass()) return false;

        Producto preductoEqual = (Producto) obj;
        return Objects.equals(this.codigo, preductoEqual.codigo);
    }

    @Override
    public int hashCode(){
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
