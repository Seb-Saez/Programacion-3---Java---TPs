package U1_act4y5_equals_hashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        Producto p1 = new Producto("a1", "Arroz", 15);
        Producto p2 = new Producto("a2", "Fideos", 20);
        Producto p3 = new Producto("a1", "Arroz negro", 18);


        agregarProducto(productos, p1);
        agregarProducto(productos, p2);
        agregarProducto(productos, p3);

       // System.out.println(productos);

        for (Producto p : productos){
            System.out.println(p);
        }

        }
        public static void agregarProducto(List<Producto> lista, Producto nuevoP){
            if (!lista.contains(nuevoP)) {
                lista.add(nuevoP);
            } else{
                System.out.println("El prducto no puede ser agregado porque esta duplicado " + nuevoP.getNombre());
            }
            }
}
