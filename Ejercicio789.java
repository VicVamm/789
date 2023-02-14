import java.util.*;
import java.io.*;

public class Ejercicio789 {
    public static void main(String[] args) {
        //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

        System.out.println("----------------\n Cadena al revés \n----------------");

        Scanner scanner = new Scanner(System.in);

        String texto;
        System.out.println("Escribe una palabra: ");
        texto = scanner.nextLine();

        StringBuilder sb = new StringBuilder(texto);

        texto = sb.reverse().toString();

        System.out.println(texto);
    }
}
class ArrayUnidimensional {
    //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    public static void main(String[] args) {
        String[] arrayUniD = {
                "Juan ",
                "Pepito ",
                "Pedrito ",
                "Ramiro"
        };
        for(int i= 0; i < arrayUniD.length; i++) {
            System.out.print(arrayUniD[i]);
        }
    }
}
class ArrayBiDimensional {
    public static void main(String[] args) {
        //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

        int [][] arrayB = new int[5][5];
        /* también sirve int [][] números = {
        {5,10,15};
        {5,10,15}
        };
        for (int i = 0; i < números.length; i++) {
            for (int y = 0; y < números[i].length; y++) {
                System.out.println("Fila: " + (i + 1) + " | Columna: " + (y + 1) +
                            "\nEl valor es: " + números[i][y] + "\n");


         */
        arrayB[0][1] = 1;
        arrayB[0][2] = 2;
        arrayB[0][3] = 3;

        arrayB[1][1] = 4;
        arrayB[1][2] = 5;
        arrayB[1][3] = 6;


        for(int i = 0; i < arrayB.length; i++) {
            for(int j = 0; j < arrayB[i].length; j++) {
                System.out.print(arrayB[i][j]);
            }
        }
    }
}
class VectorModificador {
    public static void main(String[] args) {
        //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.


        Vector<Integer> vectorMod = new Vector<>(5, 5);

        //add
        vectorMod.add(1);
        vectorMod.add(2);
        vectorMod.add(3);
        vectorMod.add(4);
        vectorMod.add(5);

        //remove
        vectorMod.remove(2);
        vectorMod.remove(3);


        System.out.println("El tamaño del vector es de: " + vectorMod.size() +  " y la capacidad es de: " + vectorMod.capacity());
        System.out.println("Resultado final es de: " + vectorMod);
    }
}

//Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

// El problema es que el vector predeterminado inicial es de 10, por lo cual haría muchas cargas innecesarias de memoria
//, por lo cual es mejor modificar la capacidad inicial a 1000.  Al utilizar un vector con capacidad por defecto y agregar elementos que superen esa capacidad,
// el vector redimensionará su tamaño creando una nueva matriz con el nuevo tamaño y copiando los elementos(arrays subyacentes) desde la antigua matriz a la nueva.
// Esto significa que cada vez que se redimensiona la matriz, se crea una copia adicional de los elementos.

class ArrayListString {
    public static void main(String[] args) {
        //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> listaArray = new ArrayList<>();

        listaArray.add("hola");
        listaArray.add("mundo");
        listaArray.add("cómo");
        listaArray.add("estás");

        LinkedList<String> listaLinked = new LinkedList<>(listaArray);


        System.out.println("Lista Array: ");
        for(String listaA : listaArray) {
            System.out.print(listaA + " ");
        }
        System.out.println("Lista Linked: ");
        for(String listaL : listaLinked) {
            System.out.print(listaL + " ");
        }
    }
}
class ArrayListInt {
    public static void main(String[] args) {
        //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle,
        // recórrelo y elimina los números pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
        // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 1; i <= 10; i++) {
            list.add(i);
            for(int impar = 0; impar < list.size(); impar++) {
                if(list.get(impar) % 2 == 0) {
                    list.remove(impar);
                }
            }
        }
        System.out.println(list);
    }
}
class ExceptionForZero {
    //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
    // que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje
    // "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Escribe los números para dividir: ");

        System.out.print("Número 1: ");
        int a = scanner.nextInt();

        System.out.print("Número 2: ");
        int b = scanner.nextInt();


        try {
            System.out.println(Dividir(a, b));
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir");
        } finally {
            System.out.println("Demo de código");
        }
    }
    public static int Dividir(int c, int d) throws ArithmeticException {
        return c / d;
    }
}
class Files {
    public static void main(String[] args) {
        //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea
        // de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el fichero de origen: ");
        String fileIn = scanner.nextLine();
        System.out.println("Introduce el fichero de destino: ");
        String fileOut = scanner.nextLine();
        copiar(fileIn, fileOut);
    }

    private static void copiar(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }

        /*

        try {
            InputStream fileIn = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Ejemplo.txt");
            byte [] data = fileIn.readAllBytes();
            fileIn.close();

            PrintStream fileOut = new PrintStream("copia.txt");
            fileOut.write(data);
            fileOut.close();


        }catch (IOException e) {
            System.out.println("Excepción: " + e.getMessage());
        }
        */
    }
}
class Creativo {
    public static void main(String[] args) {
        //Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap
        // y un ArrayList, LinkedList o array.
    }
}

