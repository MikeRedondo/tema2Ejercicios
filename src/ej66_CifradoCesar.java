void main() {
    // Julio César cifraba sus mensajes cambiando cada letra por la que está un número fijo de posiciones más adelante en el alfabeto. Con un desplazamiento de 3, la a pasa a ser d, la b pasa a ser e, y al llegar al final se vuelve a empezar: la z pasa a ser c.

    // Pide una frase y un desplazamiento entre 1 y 25, y muestra la frase cifrada. Se respetan las mayúsculas, y lo que no sea una letra de la a a la z se queda como está.

    // Frase: Hola, Martos
    // Desplazamiento (1 a 26): 3
    // Cifrada: Krod, Pduwrv

    // Para descifrar no hace falta otro programa. Prueba a meter Krod, Pduwrv con desplazamiento 23.

    // Declaramos variables.
    final String MINUSCULAS = "abcdefghijklmnñopqrstuvwxyz", MAYUSCULAS = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    String frase, cifrada;
    int desplazamiento, opcion, posicion;
    boolean esCifrar = true;

    // Creamos un menú con 3 opciones: cifrar, descifrar y salir.

    do {
        opcion = Integer.parseInt(IO.readln("""
                * MÁQUINA ENIGMA *
                ------------------
                1. Cifrar
                2. Descifrar
                3. Salir
               
                Introduce una opción:\s"""));

        switch (opcion) {
            case 1: // Cifrar
                esCifrar = true;
                break;

            case 2: // Descifrar
                esCifrar = false;
                break;

            default: // Opción inválida.
                IO.println("ERROR: Opción inválida.\n");
        }

        // Realizamos el cifrado o descifrado según lo que toque.
        if (opcion == 1 || opcion == 2) {
            cifrada = "";
            frase = IO.readln("Frase: ");
            do {
                desplazamiento = Integer.parseInt(IO.readln("Desplazamiento (1 a 26): "));
                if (desplazamiento < 1 || desplazamiento > 26) IO.println("ERROR: Desplazamiento inválido.");
            } while (desplazamiento < 1 || desplazamiento > 26);

            for (int i = 0; i < frase.length(); i++) {
                posicion = -1; // Sirve de bandera para comprobar que el carácter no está en las mayúsculas ni minúsculas.

                if (MAYUSCULAS.contains(String.valueOf(frase.charAt(i)))) { // Buscamos mayúsculas.
                    for (int j = 0; j < MAYUSCULAS.length(); j++) {
                        if (frase.charAt(i) == MAYUSCULAS.charAt(j)) {
                            posicion = j; // Obtenemos el índice de la mayúscula en el abecedario.
                            if (esCifrar) {
                                posicion += desplazamiento; // Desplazamos el índice.
                                if (posicion > 26) posicion -= 27; // Reajustamos el índice si se sale del abecedario.
                            } else {
                                posicion -= desplazamiento; // Desplazamos el índice.
                                if (posicion < 0) posicion += 27; // Reajustamos el índice si se sale del abecedario.
                            }
                            cifrada = cifrada + MAYUSCULAS.charAt(posicion); // Añadimos el carácter desplazado.
                        }
                    }
                }

                if (MINUSCULAS.contains(String.valueOf(frase.charAt(i)))) { // Buscamos minúsculas.
                    for (int j = 0; j < MINUSCULAS.length(); j++) {
                        if (frase.charAt(i) == MINUSCULAS.charAt(j)) {
                            posicion = j; // Obtenemos el índice de la minúscula en el abecedario.
                            if (esCifrar) {
                                posicion += desplazamiento; // Desplazamos el índice.
                                if (posicion > 26) posicion -= 27; // Reajustamos el índice si se sale del abecedario.
                            } else {
                                posicion -= desplazamiento; // Desplazamos el índice.
                                if (posicion < 0) posicion += 27; // Reajustamos el índice si se sale del abecedario.
                            }
                            cifrada = cifrada + MINUSCULAS.charAt(posicion); // Añadimos el carácter desplazado.
                        }
                    }
                }

                if (posicion == -1) {
                    cifrada = cifrada + frase.charAt(i);
                }
            }
            // Imprimimos la frase cifrada.
            IO.println("Cifrada: " + cifrada + "\n");
        }

    } while (opcion != 3);




}