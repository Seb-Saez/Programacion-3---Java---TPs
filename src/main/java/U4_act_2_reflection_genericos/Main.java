package U4_act_2_reflection_genericos;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        // primero tengo ue traer una referencia de la clase
        Class<?> clazz = Persona.class;


        // me traigo el constructor
        System.out.println("--- Constructor:");
        for (Constructor<?> constructores : clazz.getDeclaredConstructors()) {
            System.out.println("--------" + constructores);
        }
        ;

        // instanciar un obj

        Constructor<?> constructores = clazz.getConstructor(String.class, int.class);
        Object p1 = constructores.newInstance("Seba", 30);
        System.out.println("---Imprimimos persona");
        System.out.println(p1);


        // cambiamos nombre

        Field campoNombre = clazz.getDeclaredField("nombre");
        campoNombre.setAccessible(true);
        campoNombre.set(p1, "Leonardo");
        System.out.println("---Imprimimos persona con el nombre cambiado");
        System.out.println(p1);


        // metodo mostrar info

        Method mostrarInfoRef = clazz.getMethod("mostrarInfo");
        System.out.println("---Mostramos metodo mostrarinfo");
        mostrarInfoRef.invoke(p1);


        // Cambiar encapsulamiento de saludar

        Method refSaludar = clazz.getDeclaredMethod("Saludar");
        refSaludar.setAccessible(true);
        Object saludo = refSaludar.invoke(p1);
        System.out.println("---Metodo saludar");
        System.out.println(saludo);

    }
}
