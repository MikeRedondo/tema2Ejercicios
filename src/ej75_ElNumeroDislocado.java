void main() {
    // Pide un número y «dislócalo»: a cada cifra se le suma 1 si es par y se le resta 1 si es impar. Usa long para que admita números largos.

    // Número: 2345
    // Dislocado: 3254

    // Si te ves con ganas, hazlo al revés: dado un número dislocado, ponlo bien.

    // Declaramos variables.
    final String NUMEROS = "0123456789";
    String numeroOriginal, numeroDislocado = "";
    int opcion, posicion = 0;
    boolean esDislocar = true;

    // Creamos un menú con 3 opciones: dislocar, recolocar y salir.

    do {
        opcion = Integer.parseInt(IO.readln("""
                * DISLOCATOR-3000 *
                -------------------
                1. Dislocar
                2. Recolocar
                3. Salir
               
                Introduce una opción:\s"""));

        switch (opcion) {
            case 1: // Dislocar
                esDislocar = true;
                break;

            case 2: // Descifrar
                esDislocar = false;
                break;

            case 3: // Salir
                break;

            default: // Opción inválida.
                IO.println("ERROR: Opción inválida.\n");
        }

        // Realizamos el dislocado o recolocado según lo que toque.
        if (opcion == 1 || opcion == 2) {
            numeroDislocado = "";
            numeroOriginal = IO.readln("Número: ");

            for (int i = 0; i < numeroOriginal.length(); i++) {

                if (NUMEROS.contains(String.valueOf(numeroOriginal.charAt(i)))) { // Nos aseguramos de que el caracter sea una cifra
                    for (int j = 0; j < NUMEROS.length(); j++) {
                        if (numeroOriginal.charAt(i) == NUMEROS.charAt(j)) {
                            posicion = j; // Obtenemos el índice del número para saber si es par o impar.

                            if (posicion % 2 == 0) { // Si es un cifra par
                                posicion++; // Desplazamos el índice.
                                if (posicion > 9) posicion -= 10; // Reajustamos el índice si se sale de la lista de números.
                            } else { // Si es un cifra impar
                                posicion--; // Desplazamos el índice.
                                if (posicion < 0) posicion += 10; // Reajustamos el índice si se sale de la lista de números.
                            }
                            numeroDislocado = numeroDislocado + NUMEROS.charAt(posicion); // Añadimos el número dislocado o recolocado.
                        }
                    }
                }
            }
        }

        // Imprimimos el número dislocado o recolocado.
        if (esDislocar) IO.println("Dislocado: " + numeroDislocado + "\n");
        else IO.println("Recolocado: " + numeroDislocado + "\n");
    } while(opcion !=3);
}