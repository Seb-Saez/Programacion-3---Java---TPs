package U5_act_2_funcional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Juan", 8.5, "Matematicas"),
                new Alumno("Maria", 6.0, "Fisica"),
                new Alumno("Pedro", 9.0, "Matematicas"),
                new Alumno("Ana", 7.5, "Fisica"),
                new Alumno("Luis", 5.5, "Quimica")
        );

        // 1 nombres de los aprobados en mayusculas
        List<String> nombresAprobados = alumnos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .toList();

        System.out.println("Alumnos aprobados, en mayusuclas y ordenados:");
        System.out.println(nombresAprobados);

        // 2 promedio general

        double promedioCurso = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                        .orElse(0);
        System.out.println("Promedio general de las notas");
        System.out.println(promedioCurso);

        // 3 alumnos por curso

        Map<String, List<Alumno>> alumnosPorCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));
        System.out.println("Alumnos agrupados por curso:");
        System.out.println(alumnosPorCurso);

        // 4 mejores 3 promedios
        List<Alumno> mejores3 = alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .toList();
        System.out.println("3 mejores promedios");
        System.out.println(mejores3);

    }
}
