void main() {
    // La combinación es un número de cuatro cifras. Pídela hasta cuatro veces. Si acierta, «La caja fuerte se ha abierto satisfactoriamente»; si agota los intentos, avísale de que se ha bloqueado.

    // Declaramos las variables.
    final int COMBINACION = 2026;
    int numeroInt, intentos = 4;
    String numeroString;

    // Pedimos los datos.
    do {
        IO.println("""
            CAJA FUERTE
            [ 0 0 0 0 ]
            Intentos: %d
            """.formatted(intentos));

        do {
            numeroString = (IO.readln("Introduce un número de 4 cifras para intentar abrir la caja fuerte: "));
            if (numeroString.length() != 4) IO.println("ERROR: Le número debe tener 4 cifras.");
        } while (numeroString.length() != 4);

        numeroInt = Integer.parseInt(numeroString);

        if (numeroInt != COMBINACION) {
            intentos--;
            if (intentos > 0) IO.readln("Combinación errónea. Pulsa enter para intentarlo otra vez.");
            for (int i = 0; i < 50; i++) IO.println("");
        }
    } while (numeroInt != COMBINACION && intentos > 0);

    if (numeroInt == COMBINACION) IO.println("La caja fuerte se ha abierto satisfactoriamente.");
    if (intentos <= 0) {
        IO.println("""
            CAJA FUERTE
            [ 0 0 0 0 ]
            Intentos: 0
            """);
        IO.println("La caja fuerte se ha bloqueado.");
    }


}