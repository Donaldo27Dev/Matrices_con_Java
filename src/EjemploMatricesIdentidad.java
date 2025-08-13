public class EjemploMatricesIdentidad {
    public static void main(String[] args) {
        // El objetivo es implementar una Matriz de identidad, la cual es una matriz cuadrada que tiene unos en su diagonal
        // principal y ceros en todas las demás posiciones.

        // Definir solamente la matriz
        int[][] matriz = new int[5][5];

        // Modificar con valor de 1 únicamente la diagonal principal de la matriz
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                if(i == j){ // Las posiciones que coinciden forman la diagonal principal
                    matriz[i][j] = 1; // Asignar en esa posición el valor de 1
                }
            }
        }

        // Mostrar los resultados,
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
