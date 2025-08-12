public class EjemploMatricesColumnasVariable {
    public static void main(String[] args) {
        // Declarar una matriz sin definir el numero de columnas
        int[][] matriz = new int[3][]; // Nota: Si no se inicializa con valores un arreglo o matriz de tipo int, por defecto el valor de sus elementos será 0.

        // Inicializar las columnas de nuestra matriz con diferentes longitudes
        matriz[0] = new int[2]; // Se instancia un nuevo arreglo con la cantidad de columnas requeridas
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        // Llegar la matriz con elementos multiplicando i x j
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i*j;
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
