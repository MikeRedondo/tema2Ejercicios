void main() {
    // Pide un número y di si es capicúa (se lee igual del derecho que del revés).
    // Vamos a sacar los números de izquierda y derecha a la vez y compararlos.

    // Declaramos variables.
    int numero, numeroAuxiliar, longitud = 0, divisor, cifraIzquierda, cifraDerecha;
    boolean esCapicua = true;

    // Pedimos el número.
    numero = Integer.parseInt(IO.readln("Introduce un número: "));
    numeroAuxiliar = numero;

    // Medimos la longitud del número haciendo divisiones entre 10 hasta que el resultado sea cero.
    do {
        numero /= 10;
        longitud++;
    } while (numero > 0);

    numero = numeroAuxiliar;
    divisor = (int) Math.pow(10, longitud - 1);

    // De derecha a izquierda usamos "numero".
    // De izquierda a derecha usamos "numeroAuxiliar".
    do {
        cifraDerecha = numero % 10;
        cifraIzquierda = numeroAuxiliar / divisor;

        // Lógica para detectar si el número es capicúa.
        if (cifraIzquierda != cifraDerecha) {
            esCapicua = false;
            numero = -1; // Forzamos la salida del bucle.
        }

        //Preparamos para la siguiente comparación.
        numero /= 10; // 12.345 -> 1.234
        numeroAuxiliar %= divisor; // 12.345 -> 2.345
        divisor /= 10; // 10.000 -> 1.000
    } while (numero > 0);

    IO.println(esCapicua ? "Es capicua." : "No es capicua.");
}