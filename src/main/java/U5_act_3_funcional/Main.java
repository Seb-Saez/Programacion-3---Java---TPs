package U5_act_3_funcional;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = List.of(
                new Producto("Laptop", "Electrónica", 1200, 5),
                new Producto("Mouse", "Electrónica", 50, 30),
                new Producto("Camiseta", "Ropa", 25, 100),
                new Producto("Chaqueta", "Ropa", 150, 20),
                new Producto("Monitor", "Electrónica", 300, 10),
                new Producto("Zapatos", "Ropa", 80, 50)
        );

        // 1 Productos con precio > 100 ordenados por precio descendente
        List<Producto> caros = productos.stream()
                .filter(p -> p.getPrecio() > 100)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .toList();
        System.out.println("Productos >100 ordenados descendente: " + caros);

        // 2 Agrupar por categoría y calcular stock total
        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.summingInt(Producto::getStock)
                ));
        System.out.println("Stock total por categoría: " + stockPorCategoria);

        // 3 Generar String con nombre y precio separados por ";"
        String resumen = productos.stream()
                .map(p -> p.getNombre() + " $" + p.getPrecio())
                .collect(Collectors.joining("; "));
        System.out.println("Resumen productos: " + resumen);

        // 4️ Precio promedio general
        double promedioGeneral = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0);
        System.out.println("Precio promedio general: " + promedioGeneral);

        // Precio promedio por categoría
        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)
                ));
        System.out.println("Precio promedio por categoría: " + promedioPorCategoria);

    }
}
