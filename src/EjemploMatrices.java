
public class EjemploMatrices {
    public static void main(String[] args) {
        // Declarar e inicializar una matriz (arreglo-bidimencional)
        // El primer atributo pertenece a la cantidad de filas y el segundo a la cantidad de columnas de la matriz.
        int[][] numeros = new int[2][4];

        // Llenar la matriz de valores
        // Fila 1
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;
        // Fila 2
        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        // Obtener información de la matriz
        System.out.println("Numero de filas: " + numeros.length);
        System.out.println("Numero de columnas: " + numeros[0].length); // Se tiene que tomar como referencia una fila de la matriz
        System.out.println("Primer elemento de la matriz: " + numeros[0][0]);
        System.out.println("Ultimo elemento de la matriz: " + numeros[numeros.length - 1][numeros[1].length - 1]);

        // Asignar cada valor de la matriz a variables
        int val1 = numeros[0][0];
        int val2 = numeros[0][1];
        int val3 = numeros[0][2];
        int val4 = numeros[0][3];
        int val5 = numeros[1][0];
        int val6 = numeros[1][1];
        int val7 = numeros[1][2];
        int val8 = numeros[1][3];


        // Imprimir cada valor
        System.out.println("\nval1 = " + val1);
        System.out.println("val2 = " + val2);
        System.out.println("val3 = " + val3);
        System.out.println("val4 = " + val4);
        System.out.println("val5 = " + val5);
        System.out.println("val6 = " + val6);
        System.out.println("val7 = " + val7);
        System.out.println("val8 = " + val8);
    }
}