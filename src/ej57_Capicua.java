void main() {
    // Pide un número de cinco cifras y di si es capicúa (se lee igual del derecho que del revés).

    // Declaramos variables.
    int numero, numeroAuxiliar, numeroInvertido = 0, longitud = 0, cifraExtraida, multiplicador, resultadoMultiplicacion;

    // Pedimos y validamos el número.
    do {
        numero = Integer.parseInt(IO.readln("Introduce un número de 5 cifras: "));
        if (numero < 10000 || numero > 99999) {
            IO.readln("ERROR: El número debe tener exactamente 5 cifras. Pulsa enter para volver a intentarlo.");
            for (int i = 0; i < 10; i++) {
                IO.println();
            }
        }
    } while (numero < 10000 || numero > 99999);

    numeroAuxiliar = numero;

    // Medimos la longitud del número haciendo divisiones entre 10 hasta que el resultado sea cero.
    do {
        numero /= 10;
        longitud++;
    } while (numero > 0);

    multiplicador = longitud - 1;
    numero = numeroAuxiliar;

    // Creamos el número invertido.

    for (int i = 0; i < longitud; i++) {
        // Extraemos una cifra del número y la colocamos el lado opuesto del nuevo, empezando por la derecha.
        cifraExtraida = numero % 10;
        resultadoMultiplicacion = cifraExtraida * Math.powExact(10, multiplicador); // Primero multiplica por 10.000, luego por 1.000, luego por 100, etc.
        multiplicador--;
        numeroInvertido += resultadoMultiplicacion; // Sumamos la cifra extraida en la posición contraria.
        numero /= 10; // Acortamos número quitandole la cifra extraida para pasar a la siguiente cifra.
    }

    IO.println("Número invertido: " + numeroInvertido);

    IO.println(numeroAuxiliar == numeroInvertido ? "Es capicua." : "No es capicua.");


}