public class EjemploMatricesBuscar {
    public static void main(String[] args) {
        // Definir e inicializar una matriz de enteros
        int[][] matricesDeEnteros = {
                {26,80,30,69},
                {2,45,67,32},
                {11,89,5,66}
        };

        // Elemento a buscar
        int elementoBuscado = 66;

        // Bandera para cambiar el estado
        boolean bandera = false;

        // Variables de control del for, para poder saber la posición del valor buscado
        int i;
        int j = 0; // Es necesario inicializar la variable j en cero.

        // Recorrer las filas e implementar una etiqueta para el primer loop for
        buscar: for (i = 0; i < matricesDeEnteros.length; i++){
            for (j = 0; j < matricesDeEnteros[i].length; j++) { // Recorrer las columnas
                if(matricesDeEnteros[i][j] == elementoBuscado){ // Comparar el elemento a buscar con cada valor de la matrix
                    bandera = true; // Cambiar el estado de la bandera
                    break buscar; // Interrumpir la busqueda si se encuentra el elemento

                }
            }
        }

        // Imprimir resultados
        if(bandera){
            System.out.println("El valor buscado se encuentra en las coordenadas: [" + i + "][" + j + "]");
        } else {
            System.out.println("El elemento buscado no se encuentra en la matriz");
        }

    }
}
