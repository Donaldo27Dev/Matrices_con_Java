import java.util.Scanner;

public class Tarea19_ImprimirUnaSilla {
    public static void main(String[] args) {
        /*
        Escribir un programa para una matriz de n x n e imprima en ella una silla (o letra h minúscula) construida a base del número 1
        y utilizar el número 0 como espacio. El tamaño de la silla se basa en una variable n que indicará el tamaño de la figura a
        imprimir en una matriz de n x n.

        Por ejemplo para n=5 se obtiene:
        10000
        10000
        11111
        10001
        10001

        Por ejemplo para n=6 se obtiene:
        100000
        100000
        100000
        111111
        100001
        100001
        */

        Scanner leer = new Scanner(System.in);
        // Solicitar los datos al usuario
        System.out.print("Ingresa el tamaño que quieres que tenga la Matriz (n x n): ");
        int tam = leer.nextInt();

        int[][] matriz = new int[tam][tam];

        // Validar que el usuario ingrese un tamaño de matriz aceptable
        if(tam == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }

        // Formar la silla en la matriz
        for(int i = 0; i < matriz.length; i++) {
            int valMitadMatriz = tam/2;
            for(int j = 0; j < matriz[i].length; j++) {
                if(j == 0 || i == valMitadMatriz || (j == tam - 1 && i >= tam / 2)) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Mostrar la Matriz
        System.out.println("========= MATRIZ =========");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

    }
}
