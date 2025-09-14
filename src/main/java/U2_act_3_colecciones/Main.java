package U2_act_3_colecciones;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> setProductos = new HashSet<>();

        Producto p1 = new Producto("p1", "Notebook gamer");
        Producto p2 = new Producto("p2", "Mousepad monas chinas");
        Producto p3 = new Producto("p3", "Pasta termica");
        Producto p4 = new Producto("p1", "Disco solido");


        setProductos.add(p1);
        setProductos.add(p2);
        setProductos.add(p3);
        setProductos.add(p4);

        for (Producto p : setProductos){
            System.out.println(p);
        }



    }
}
