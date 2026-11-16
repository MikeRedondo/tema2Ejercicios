void main() {

    // Declaramos variables.
    int altura, alturaSuperior, alturaInferior, espaciosFuera, espaciosDentro;

    // Pedimos datos
    do {
        for (int i = 0; i < 100; i++) { // Limpiamos la pantalla
            IO.println();
        }

        altura = Integer.parseInt(IO.readln("Introduzca la altura (impar y entre 9 y 17): "));
        if (altura % 2 == 0 || altura < 9 || altura > 17) IO.readln("ERROR: Altura inválida. Pulsa enter para reintentarlo.");

    } while (altura % 2 == 0 || altura < 9 || altura > 17);

    // Definimos la altura de las dos partes de la cometa.
    alturaSuperior = (altura / 2) + 1;
    alturaInferior = altura / 2;


    // Pintamos la parte superior de la cometa.
    espaciosFuera = alturaSuperior - 1;
    espaciosDentro = 0;

    for (int fila = 1; fila < alturaSuperior; fila++) { // Pintamos cada fila

        for (int i = 0; i < espaciosFuera; i++) { // Pintamos los espacios de fuera.
            IO.print(" ");
        }

        if (fila == 1) { // Es la primera fila.
            IO.println(fila);
        } else { // Son las demás filas.
            IO.print(fila); // Pintamos el primer número.
            for (int i = 0; i < espaciosDentro; i++) { // Pintamos los espacios de dentro de la izquierda.
                IO.print(" ");
            }
            IO.print("|"); // Pintamos el palote.
            for (int i = 0; i < espaciosDentro; i++) { // Pintamos los espacios de dentro de la derecha.
                IO.print(" ");
            }
            IO.println(fila); // Pintamos el segundo número.
        }

        // Preparamos las variables para la siguiente fila.
        espaciosFuera--;
        if (fila != 1) espaciosDentro++;
    }


    // Pintamos la línea del medio de la cometa.
    IO.print(alturaSuperior);// Pintamos el primer número.
    for (int i = 0; i < altura - 2; i++) { // Pintamos los guiones de dentro.
        IO.print("-");
    }
    IO.println(alturaSuperior);// Pintamos el segundo número.


    // Pintamos la parte inferior de la cometa.
    espaciosFuera = 1;
    espaciosDentro = alturaInferior - 2;

    for (int fila = alturaInferior; fila >= 1; fila--) { // Pintamos cada fila

        for (int i = 0; i < espaciosFuera; i++) { // Pintamos los espacios de fuera.
            IO.print(" ");
        }

        if (fila == 1) { // Es la última fila.
            IO.println(fila);
        } else { // Son las demás filas.
            IO.print(fila); // Pintamos el primer número.
            for (int i = 0; i < espaciosDentro; i++) { // Pintamos los espacios de dentro de la izquierda.
                IO.print(" ");
            }
            IO.print("|"); // Pintamos el palote.
            for (int i = 0; i < espaciosDentro; i++) { // Pintamos los espacios de dentro de la derecha.
                IO.print(" ");
            }
            IO.println(fila); // Pintamos el segundo número.
        }

        // Preparamos las variables para la siguiente fila.
        espaciosFuera++;
        if (fila != 1) espaciosDentro--;
    }


    // Pintamos la cuerda de la cometa.
    espaciosFuera -= 2;

    for (int filaCuerda = 0; filaCuerda < alturaInferior; filaCuerda++) { // Pintamos cada fila.

        for (int i = 0; i < espaciosFuera; i++) { // Pintamos los espacios de fuera.
            IO.print(" ");
        }

        IO.println("|"); // Pintamos la cuerda.

        // Preparamos las variables para la siguiente fila.
        espaciosFuera--;
    }

}