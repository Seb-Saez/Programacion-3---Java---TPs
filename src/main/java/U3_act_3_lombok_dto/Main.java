package U3_act_3_lombok_dto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // productos
        Producto p1 = new Producto("p01", "Arroz", 35, "Dos hermanos");
        Producto p2 = new Producto("p02", "Fideos", 45, "Don vicente");
        Producto p3 = new Producto("p03", "Fernet", 60, "Branca");

        // creamos los dto a partir de los productos

        ProductDTO dto1 = new ProductDTO(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductDTO dto2 = new ProductDTO(p2.getCodigo(), p2.getNombre(), p2.getPrecio());
        ProductDTO dto3 = new ProductDTO(p3.getCodigo(), p3.getNombre(), p3.getPrecio());

        // creamos la lista
        List<ProductDTO> listaDTO = new ArrayList<>();

        listaDTO.add(dto1);
        listaDTO.add(dto2);
        listaDTO.add(dto3);

        // imprimimos la luista
        System.out.println("Lista de los DTO:");
        for (ProductDTO p : listaDTO){
            System.out.println(p);
        };

    }
}
