import Implementacion.Estrategia_1_String;
import Interfaces.PilaTDAString;

public class TestHistorialNavegacion {
    public static void main(String[] args) {

        PilaTDAString p1 = new Estrategia_1_String();

        probarPila("Estrategia 1", p1);

    }

    public static void probarPila(String nombre,PilaTDAString pila) {
        System.out.println("=== " + nombre + " ===");

        pila.InicializarPila();

        pila.Apilar("hola");
        pila.Apilar("Como va");
        pila.Apilar("chau");

        System.out.println("Tope luego de apilar hola,como va y Chau: " + pila.Tope());

        pila.Desapilar();
        System.out.println("Tope luego de desapilar una vez: " + pila.Tope());

        pila.Desapilar();
        System.out.println("Tope luego de desapilar otra vez: " + pila.Tope());

        pila.Desapilar();
        System.out.println("¿Pila vacía?: " + pila.PilaVacia());

        System.out.println();
    }

}