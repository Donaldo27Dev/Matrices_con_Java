public class EjemploMatricesMarco {
    public static void main(String[] args) {
        // El objetivo es cambiar únicamente el marco de nuestra matriz
        // Definir solamente la matriz, los valores se inicializan en 0.
        int[][] matriz = new int[5][5];

        // Modificar el marco de la matriz
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                // Validar únicamente las columnas y filas que queremos modificar, en este caso la primera y la última
                if(i == 0 || j == 0 || i == matriz.length - 1 || j == matriz.length - 1){
                    matriz[i][j] = 1;
                }
            }
        }

        // Mostrar los resultados
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
