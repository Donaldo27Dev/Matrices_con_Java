public class EjemploMatrizSimetrica {
    public static void main(String[] args) {
        /*
        Definir algunos conceptos primero:
        ¿Qué es una Matriz Simétrica?
        Es una matriz cuadrada (mismo número de filas y columnas) que es igual a su transpuesta.
        La transpuesta se obtiene intercambiando filas por columnas.
        Ejemplo:
            [a b]       [a c]
            [c d]  ->   [b d]
        Si la matriz original y su transpuesta son iguales, es simétrica.
        */

        // Definir e inicializar una matriz cuadrada de 4x4 que, en este caso, es simétrica
        int[][] matrizSimetrica = {
                {1,8,3,5},
                {8,6,1,7},
                {3,1,7,2},
                {5,7,2,0}
        };

        // Variable para saber si la matriz es simétrica
        boolean simetrica = true;
        // Variables para recorrer la matriz
        int i = 0;

        // Comprobar si la matriz es simétrica
        // El primer bucle recorre las filas
        while (i < matrizSimetrica.length && simetrica){
            // Reiniciar para la nueva fila
            int j = 0;
            // El segundo bucle recorre las columnas, pero solo hasta "i" para no comparar elementos repetidos
            while (j < i && simetrica){
                // Compara elemento (i, j) con el elemento (j, i)
                // Si son distintos, la matriz no es simétrica
                if (matrizSimetrica[i][j] != matrizSimetrica[j][i]){
                    simetrica = false;
                }
                // Avanzar a la siguiente columna
                j++;
            }
            // Avanzar a la siguiente fila
            i++;
        }

        // Imprimir resultado
        if(simetrica){
            System.out.println("La matriz SI es simétrica");
        } else {
            System.out.println("La matriz NO es simétrica");
        }
    }
}
