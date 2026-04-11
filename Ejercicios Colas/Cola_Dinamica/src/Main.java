import Implementacion.ColaDinamica;
import Implementacion.ColaEstatica;
import Interface.ColaTDA;

public class Main {
    public static void main(String[] args) {
        // Inicialización
        ColaTDA colaEstatica = new ColaEstatica();
        ColaTDA colaAuxiliarDinamica = new ColaDinamica();

        colaEstatica.InicializarCola();
        colaAuxiliarDinamica.InicializarCola();

        // 1. Crear la cola estática con 20 posiciones
        System.out.println("--- Paso 1: Llenando Cola Estática (20 posiciones) ---");
        for (int i = 1; i <= 20; i++) {
            colaEstatica.Acolar(i * 5); // Ejemplo: múltiplos de 5
        }

        // 2. Seleccionar un número para eliminar (por ejemplo, el 50)
        int objetivo = 50;
        System.out.println("Número seleccionado para eliminar de la cola: " + objetivo);

        // 3. Desencolar la estática hacia la dinámica (filtrando)
        System.out.println("\n--- Paso 2: Desencolando hacia Auxiliar Dinámica ---");
        while (!colaEstatica.ColaVacia()) {
            int valor = colaEstatica.Primero();
            if (valor != objetivo) {
                colaAuxiliarDinamica.Acolar(valor);
                System.out.println("Pasando a auxiliar: " + valor);
            } else {
                System.out.println("¡Objetivo encontrado! Se elimina: " + valor);
            }
            colaEstatica.Desacolar();
        }

        // 4. Volver a armar la cola estática desde la dinámica
        System.out.println("\n--- Paso 3: Re-encolando en la Estática original ---");
        while (!colaAuxiliarDinamica.ColaVacia()) {
            int valorAux = colaAuxiliarDinamica.Primero();
            colaEstatica.Acolar(valorAux);
            System.out.println("Restaurando a estática: " + valorAux);
            colaAuxiliarDinamica.Desacolar();
        }

        // 5. Impresión del resultado final
        System.out.println("\n--- Resultado Final (Cola Estática reconstruida) ---");
        if (colaEstatica.ColaVacia()) {
            System.out.println("La cola quedó vacía.");
        } else {
            while (!colaEstatica.ColaVacia()) {
                System.out.print("[" + colaEstatica.Primero() + "] ");
                colaEstatica.Desacolar();
            }
        }
        System.out.println("\nProceso finalizado.");
    }
}