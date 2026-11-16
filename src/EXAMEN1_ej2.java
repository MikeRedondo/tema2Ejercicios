void main() {
    // PINTAR EL ÁRBOL

    // Declaramos variables.
    int altura, ancho = 1, espacios;

    // Pedimos y validamos datos.
    do {
        altura = Integer.parseInt(IO.readln("Introduce la altura del árbol (número par entre 6 y 30): "));

        if (altura % 2 != 0 || altura < 6 || altura > 30) {
            IO.readln("ERROR: Altura inválida. Pulsa enter para volver a intentarlo.");
            for (int i = 0; i < 100; i++) { // Limpiamos la pantalla.
                IO.println("");
            }
        }
    } while (altura % 2 != 0 || altura < 6 || altura > 30);

    espacios = altura -1;

    // Pintamos el árbol de navidad.

    for (int fila = 1; fila <= altura ; fila++) { // Creamos cada fila.

        for (int i = 0; i <= espacios; i++) {
            IO.print(" ");
        }

        for (int caracteres = 1; caracteres <= ancho ; caracteres++) { // Pintamos los caracteres de cada fila.
            if (fila % 2 == 0 ) IO.print("* "); // En las filas pares solo pintamos asteriscos.
            else { // En las filas impares...
                if (caracteres % 2 != 0) IO.print("* "); // Los caracteres impares son asteríscos...
                else IO.print("o "); // y los pares círculos.
            }
        }

        ancho++;
        espacios--;
        IO.println("");
    }

    for (int i = 0; i < altura / 2; i++) {
        IO.print("  ");
    }

    IO.println("|____|");


}