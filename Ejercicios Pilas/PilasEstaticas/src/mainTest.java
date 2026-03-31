import Implementacion.Estrategia_1_String;
import Interfaces.PilaTDAString;

public class mainTest {
    public static void main(String[] args) {

        PilaTDAString p1 = new Estrategia_1_String();

        probarPila("Historial de Navegacion", p1);

    }

    public static void probarPila(String nombre,PilaTDAString pila) {
        System.out.println("=== " + nombre + " ===");

        pila.InicializarPila();

        pila.Apilar("fi.uba.ar");
        System.out.println("Tope luego de apilar fi.uba.ar: " + pila.Tope());

        pila.Apilar("campus.utn.edu.ar");
        System.out.println("Tope luego de apilar campus.utn.edu.ar: " + pila.Tope());

        pila.Apilar("stackoverflow.com");
        System.out.println("Tope luego de apilar stackoverflow.com: " + pila.Tope());

        pila.Desapilar();
        System.out.println("Tope luego de desapilar una vez: " + pila.Tope());


        System.out.println();
    }

}