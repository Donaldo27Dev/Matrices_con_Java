public class Tarea18_ImprimirUnaX {
    public static void main(String[] args) {
        /*
        Escribir un programa que imprima una X construida a base de la letra X en las diagonales de la matriz y utilizar el carácter guion bajo como relleno.
        El tamaño de la x se basa en una variable n que indicará el tamaño de la letra para imprimir en una matriz de n x n.
        El carácter "X" en mayúscula y el guion bajo "_" para los espacios.

        Por ejemplo para n=5 se obtiene:
        X___X
        _X_X_
        __X__
        _X_X_
        X___X

        Por ejemplo para n=6 se obtiene:
        X____X
        _X__X_
        __XX__
        __XX__
        _X__X_
        X____X

        Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
         */

        // Definir el tamaño de la matriz
        int tam = 5;

        // Inicializar la matriz de acuerdo al valor del tamaño
        String[][] matrizX = new String[tam][tam];

        // Implementar lógica para construir la X
        for (int i = 0; i < matrizX.length; i++) { // Recorrer las filas de la matriz
            for(int j = 0; j < matrizX.length; j++) { // Recorrer las columnas de la matriz
                // Partiendo de una matriz de 5*5 se conoce que la diagonal principal (que va de izquierda superior a derecha inferior)
                // se construye cuando fila y columna coinciden: (0,0),(1,1),(2,2)... entonces para construir la diagonal
                // opuesta se considera:
                // j == (tamañoArreglo) - i --> (0,4),(1,3),(2,2)...
                if(i == j || (j == matrizX.length - 1 - i)) {
                    matrizX[i][j] = "X"; // Colocar en la posición actual X
                } else {
                    matrizX[i][j] = "_"; // Colocar en la posición actual _
                }
            }
        }

        // Mostrar los resultados
        for (int i = 0; i < matrizX.length; i++) {
            for(int j = 0; j < matrizX.length; j++) {
                System.out.print(matrizX[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
