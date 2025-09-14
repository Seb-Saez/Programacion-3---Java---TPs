package U3_act_1_lombok_dto;

public class Main {
    public static void main(String[] args) {
        Persona personaVacia = new Persona();
        Persona persona1 = new Persona("Jorge", 23);


        // imprimimo info de personaVacia y persona1
        System.out.println("Las 2 personas son: ");
        System.out.println(personaVacia);
        System.out.println(persona1);

        // cambiamos nombre a personaVacia
        personaVacia.setNombre("Maria");
        personaVacia.setEdad(30);

        System.out.println("Le cambiamos el nombre a personaVacia y le ponemos Maria: ");
        System.out.println(personaVacia);

        // usamos el getter

        System.out.println("la persona 1 se llama: ");
        System.out.println(persona1.getNombre());
        System.out.println("La personaVacia, que ahora se llamam maria tiene una edad de: ");
        System.out.println(personaVacia.getEdad());

    }
}
