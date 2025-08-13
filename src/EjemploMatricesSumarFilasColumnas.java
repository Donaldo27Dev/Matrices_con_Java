public class EjemploMatricesSumarFilasColumnas {
    public static void main(String[] args) {
        // IMPORTANTE: Cuando la matriz es cuadrada los elementos de las filas y columnas se pueden sumar en un solo bucle,
        // pero cuando la matriz varía entre sus columnas y filas, el conteo se debe realizar por separado.
        // Definir e inicializar la Matriz A
        int[][] matrizA = {
                {5,8,9,1},
                {6,9,7,5},
                {8,6,12,34}
        };

        int filas = matrizA.length;
        int columnas = matrizA[0].length;

        // Definir un contador para filas y columnas
        int cantTotalFilas;
        int cantTotalColumnas;

        // Declarar dos arreglos para almacenar la cantidad de las sumas;
        int[] sumasFilas = new int[filas];
        int[] sumasColumnas = new int[columnas];

        // Recorrer los elementos de la matriz A para sumar la cantidad de las filas y columnas además de mostrar los resultados
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                sumasFilas[i] += matrizA[i][j];
                sumasColumnas[j] += matrizA[i][j];
            }
        }

        // Mostrar las sumas de cada fila
        for(int i = 0; i < filas; i++){
            System.out.println("La suma de la fila " + i + " es: " + sumasFilas[i]);
        }

        // MostrarMostrar las sumas de cada columna
        for (int i = 0; i < columnas; i++) {
            System.out.println("La suma de la columna " + i + " es: " + sumasColumnas[i]);
        }
    }
}
