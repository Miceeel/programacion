package practica1;
public class pruebaDatos{
    public static void main(String[] args) {
    String cadena = "hola mundo";
    int edad = 20;
    double altura = 1.75;

    System.out.println(cadena);
    System.out.println("edad: "+ edad);
    System.out.println("altura: "+ altura + "m" );

    System.out.println("_________________________________");

    System.out.println("creando un tipo de dato abstracto");

    Datos persona = new Datos("juan",24,"juangmail.com");
    System.out.println("nombre: " + persona.getNombre());
    System.out.println("edad: " + persona.getEdad());
    System.out.println("email: " + persona.getcorreo());

    Datos persona2 = new Datos();
    persona2.setNombre("Maria");
    persona2.setEdad(30);
    persona2.setcorreo("maria21@gmail.com");
    System.out.println();
    System.out.println("nombre: " + persona2.getNombre());
    System.out.println("edad: " + persona2.getEdad());
    System.out.println("email: " + persona2.getcorreo());

 }
}