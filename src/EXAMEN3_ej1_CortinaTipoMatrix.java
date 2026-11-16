void main() {

    boolean esInfinita = false;
    int altura = -1, fila = 1, valorCaracter;
    String respuesta;

    // Preguntamos si la cortina debe ser infinita o no
    respuesta = IO.readln("¿Quieres hacerla infinita? (S/N) ");
    esInfinita = respuesta.equalsIgnoreCase("s");

    // Si no es infinita, pedimos la altura.
    if (!esInfinita) {
        do {
            altura = Integer.parseInt(IO.readln("Introduce la altura de la cortina: "));
            if (altura <= 4) IO.println("ERROR: Altura inválida, debe ser mayor que 4.");
        } while (altura <= 4);
    }

    // Pintamos la cortina. Las alturas las controla en do while, porque no podemos saber como de larga tiene que ser.
    do {
        // Bucle que pinta cada fila.
        for (int caracter = 1; caracter <= 150 ; caracter++) {
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // Buscamos el valor del caracter que hay que pintar.
            valorCaracter = (fila * 10) + caracter;

            // Primero miramos si la fila es par o impar.
            if (fila % 2 == 0) { // La posición se divide entre 1.023 y nos quedamos con el módulo.
                valorCaracter %= 1023;
                if (valorCaracter < 1000) valorCaracter += 1000;
            } else { // La posición se divide entre 950 y nos quedamos con el módulo.
                valorCaracter %= 950;
                if (valorCaracter < 920) valorCaracter += 920;
            }
            IO.print((char) valorCaracter);
        }

        // Preparamos la siguiente fila.
        IO.println();
        altura--;
        fila++;
    } while (esInfinita || altura > 0);

}