public class EjemploMatrizTranspuesta {
    public static void main(String[] args) {
        // Definir e inicializar nuestra matriz a transformar
        int[][] matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        // Imprimir la matriz original
        System.out.println("Matriz Original");
        for(int i = 0; i < matriz.length; i++) { // Recorre las filas de la matriz
            for(int j = 0; j < matriz[i].length; j++) { // Recorre las columnas de cada fila
                System.out.print(matriz[i][j] + "\t"); // Imprime el elemento con tabulación
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        // Convertir la matriz original en su transpuesta
        int i = 1; // Comienza en la segunda fila (índice 1) para evitar reintercambiar elementos ya procesados
        int aux; // Variable auxiliar para el intercambio
        while(i < matriz.length) { // Recorre las filas desde la segunda hacia la última
            int j = 0;
            while(j < i) { // Solo recorre hasta antes de la diagonal principal
                // Intercambia el valor en [i][j] con el de [j][i]
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
                j++; // Avanza a la siguiente columna
            }
            i++; // Avanza a la siguiente fila
        }

        // Imprimir la matriz transpuesta (modificada)
        System.out.println("Matriz Modificada");
        for(int k = 0; k < matriz.length; k++) { // Recorrer filas
            for(int j = 0; j < matriz[k].length; j++) { // Recorrer columnas
                System.out.print(matriz[k][j] + "\t");
            }
            System.out.println();
        }
    }
}
