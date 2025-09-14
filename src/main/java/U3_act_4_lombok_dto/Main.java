package U3_act_4_lombok_dto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // creamos productos
        Producto p1 = Producto.builder()
                .codigo("p01")
                .nombre("Fernet Branca")
                .precio(50)
                .build();

        Producto p2 = Producto.builder()
                .codigo("p02")
                .nombre("Cerveza Imperial")
                .precio(20)
                .build();

        Producto p3 = Producto.builder()
                .codigo("p03")
                .nombre("Aperitivo Cynar")
                .precio(35)
                .build();

        // creamos los records
        ProductoRecord record1 = new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoRecord record2 = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());
        ProductoRecord record3 = new ProductoRecord(p3.getCodigo(), p3.getNombre(), p3.getPrecio());

        // creamos la lista
        List<ProductoRecord> listaRecords = new ArrayList<>();
        listaRecords.add(record1);
        listaRecords.add(record2);
        listaRecords.add(record3);

        System.out.println("La lista de records es:");
        for (ProductoRecord p : listaRecords){
            System.out.println(p);
        }
    }
}
