import practica4.complejidadTemporal;

public class testComplejidad {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 3};
        int objetivo = 8;
        int n = 10;

        long inicio = System.nanoTime();
        int resultadoLineal = complejidadTemporal.sumaLineal(array);
        long fin = System.nanoTime();
        System.out.println("Suma lineal: " + resultadoLineal + " - Tiempo: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();
        int resultadoBinario = complejidadTemporal.busquedaBinaria(array, objetivo);
        fin = System.nanoTime();
        System.out.println("Búsqueda binaria: " + resultadoBinario + " - Tiempo: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();
        int fibIterativo = eficienciaAlgoritmos.Fibonacci.fibIterativo(n);
        fin = System.nanoTime();
        System.out.println("Fibonacci iterativo: " + fibIterativo + " - Tiempo: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();
        int fibMemo = eficienciaAlgoritmos.Fibonacci.fibMemoization(n);
        fin = System.nanoTime();
        System.out.println("Fibonacci memoization: " + fibMemo + " - Tiempo: " + (fin - inicio) + " ns");

        if (n <= 10) {
            inicio = System.nanoTime();
            int fibExp = eficienciaAlgoritmos.Fibonacci.fibExponencial(n);
            fin = System.nanoTime();
            System.out.println("Fibonacci exponencial: " + fibExp + " - Tiempo: " + (fin - inicio) + " ns");
        }

        eficienciaAlgoritmos.AnalisisCasos.algoritmoAdaptativo(array);
    }

}