public class EjemploMatricesStringForSimplificado {
    public static void main(String[] args){
        // Declarar e Inicializar una matriz del tipo String con datos estáticos
        // Cada llave({}) separada por una coma representa una fila, y la cantidad de columnas por el número de datos de cada llave({})
        String[][] nombres = { {"Fernanda", "Mariana"}, {"Daniel", "Donovan"}, {"David", "Jenifer"} };

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
