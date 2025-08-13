public class EjemploMatrizTransponerMatriz {
    public static void main(String[] args) {
        // Definir e inicializar la Matriz principal
        int[][] matrizP = new int[8][4]; // 4 filas 8 columnas

        // Definir e inicializar la Matriz transpuesta
        int[][] matrizT = new int[4][8]; // 8 filas 4 columnas

        // Llenar de valores la matriz principal
        int i = 0;
        while(i < matrizP.length) {
            int j = 0;
            while(j < matrizP[i].length) {
               matrizP[i][j] = i + j * 3;
               System.out.print(matrizP[i][j] + "\t");
               j++;
            }
            i++;
            System.out.println();
        }


        // Almacenar en la matriz transpuesta la matriz principal
        for(int k = 0; k < matrizP.length; k++) {
            for(int j = 0; j < matrizP[k].length; j++) {
                matrizT[j][k] = matrizP[k][j]; // Voltear, las filas en las columnas de la matriz principal a la matriz transpuesta
            }
        }

        // Imprimir los resultados
        System.out.println("La matriz transpuesta de b: ");
        for(int k = 0; k < matrizT.length; k++) {
            for(int j = 0; j < matrizT[k].length; j++) {
                System.out.print(matrizT[k][j] + "\t");
            }
            System.out.println();
        }


    }
}
