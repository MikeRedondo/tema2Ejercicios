void main() {
    // Convierte un número decimal al sistema de palotes: cada cifra se escribe con tantas barras como vale, y las cifras se separan con un guion. El 0 no lleva ninguna barra, así que se nota porque quedan dos guiones seguidos.

//    Número entero positivo: 47021
//    47021 en palotes: ||||-|||||||--||-|

    // Declaramos variables.
    int num, numCopia, cifra;
    String palotes = "", cifraPalotes = "";

    // Pedimos datos.
    num = Integer.parseInt(IO.readln("Introduce un número entero positivo: "));
    numCopia = num;

    // Sacamos número de derecha a izquierda, convertimos cada cifra que sale en palotes y la añadimos a la cadena final.
    do {
        cifra = num % 10; // Extraemos la cifra de la derecha.
        num /= 10; // Recortamos el número para la siguiente repetición

        for (int i = 0; i < cifra; i++) {
            palotes = "|" + palotes; // Añadimos los palotes de la cifra al string por la izquierda.
        }
        palotes = "-" + palotes; // Añadimos un guion al string por la izquierda para separar los números.

        cifraPalotes = ""; // Reseteamos la variable para que no se acumulen los palotes.

    } while (num > 0);

    palotes = palotes.substring(1); // Empezamos en el índice 1 para no imprimir el guion inicial.

    IO.println(numCopia + " en palotes: " + palotes);
}