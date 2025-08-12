public class EjemploMatricesStringFor {
    public static void main(String[] args){
        // Declarar matriz del tipo String
        String[][] nombres = new String[3][2];

        // Inicializar la matriz
        nombres[0][0] = "Fernanda";
        nombres[0][1] = "Mariana";
        nombres[1][0] = "Daniel";
        nombres[1][1] = "Donovan";
        nombres[2][0] = "David";
        nombres[2][1] = "Jenifer";

        // Recorrer sus elementos utilizando el bucle for(){} tradicional
        System.out.println("Iterando con loop for: ");
        for (int i = 0; i < nombres.length; i++){ // Primer for para recorrer las filas
            for (int j = 0; j < nombres[i].length; j++){ // Segundo for para recorrer las columnas
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        // Recorrer sus elementos utilizando el bucle forEach(){}
        System.out.println("Iterando con loop foreach: ");
        for(String[] fila: nombres) {
            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

    }
}
