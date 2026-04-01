import Implementacion.Estrategia_1_String;
import Interfaces.PilaTDAString;

public class TestEditorCodigo {
    public static void main(String[] args) {

        PilaTDAString p1 = new Estrategia_1_String();
        PilaTDAString backup = new Estrategia_1_String();

        probarPila("Estrategia 1", p1, backup);

    }

    public static void probarPila(String nombre,PilaTDAString pila, PilaTDAString pilaBackup) {
        System.out.println("=== " + nombre + " ===");

        pila.InicializarPila();
        pilaBackup.InicializarPila();

        pila.Apilar("print");
        System.out.println("Tope luego de escribir print : " + pila.Tope());
        pila.Apilar("(");
        System.out.println("Tope luego de escribir ( : " + pila.Tope());
        pila.Apilar("River");
        System.out.println("Tope luego de escribir River : " + pila.Tope());
        pila.Apilar("sos");
        System.out.println("Tope luego de escribir sos : " + pila.Tope());
        pila.Apilar("un");
        System.out.println("Tope luego de escribir un : " + pila.Tope());
        pila.Apilar("boton");
        System.out.println("Tope luego de escribir boton : " + pila.Tope());
        pila.Apilar(")");
        System.out.println("Tope luego de escribir ) : " + pila.Tope());

        pilaBackup.Apilar(pila.Tope());
        pila.Desapilar();
        System.out.println("Tope luego de desapilar una vez: " + pila.Tope());
        System.out.println("Uy borre sin querer y quiero volver para atras: " + pilaBackup.Tope());
        pila.Apilar(pilaBackup.Tope());
        System.out.println("Tope luego de recuperar el valor: " + pila.Tope());
        pilaBackup.Apilar(pila.Tope());
        pila.Desapilar();
        System.out.println("Tope luego de desapilar otra vez: " + pila.Tope());
        pilaBackup.Apilar(pila.Tope());
        pila.Desapilar();
        System.out.println("Tope luego de desapilar otra vez: " + pila.Tope());
        pilaBackup.Apilar(pila.Tope());
        pila.Desapilar();
        System.out.println("Tope luego de desapilar otra vez: " + pila.Tope());
        pilaBackup.Apilar(pila.Tope());
        pila.Desapilar();
        System.out.println("Tope luego de desapilar otra vez: " + pila.Tope());
        pilaBackup.Apilar(pila.Tope());
        pila.Desapilar();
        System.out.println("Tope luego de desapilar otra vez: " + pila.Tope());
        pilaBackup.Apilar(pila.Tope());
        pila.Desapilar();
        System.out.println("Tope luego de desapilar otra vez: " + pila.Tope());
        pilaBackup.Apilar(pila.Tope());
        pila.Desapilar();
        System.out.println("¿Pila vacía?: " + pila.PilaVacia());
        System.out.println("¿Pila backup vacía?: " + pilaBackup.PilaVacia());
        System.out.println("Si quisiera volver para atras el valor seria: " + pilaBackup.Tope());

        System.out.println();
    }

}