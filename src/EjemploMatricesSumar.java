public class EjemploMatricesSumar {
    public static void main(String[] args) {
        // Sumar dos matrices en una tercera:
        // Definir e inicializar la Matriz A:
        int[][] matrizA = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Definir e inicializar la Matriz B:
        int[][] matrizB = {
                {10,11,12},
                {13,14,15},
                {16,17,18}
        };
        // Definir una Matriz para almacenar los valores de la suma de A y B
        int[][] suma = new int[3][3];

        // Proceso para sumar en una tercera Matriz los elementos A y B y mostrar el resultado.
        int i = 0;
        while(i < matrizA.length) {
            int j = 0;
            while(j < matrizA[i].length) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j]; // Sumar las matrices
                System.out.print(suma[i][j] + "\t"); // Mostrar los resultados
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
