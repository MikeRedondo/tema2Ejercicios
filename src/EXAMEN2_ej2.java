void main() {

    // Declaramos variables.
    String palabraElegida;
    int opcion, altura, longitudPalabra, elementos, espacios;

    // Iniciamos el menú principal.
    do {

        // Reinicializamos palabraElegida para segunda y siguientes vueltas. Lo usamos como bandera a la hora de elegir opciones.
        palabraElegida = "";

        for (int i = 0; i < 100; i++) { // Limpiamos la pantalla
            IO.println("");
        }

        opcion = Integer.parseInt(IO.readln("""
                Bienvenido al programa de pirámides homenaje
                1. Pintar una pirámide con la palabra "HEROES"
                2. Pintar una pirámide con la palabra "GRACIAS"
                3. Pintar una pirámide con la palabra "IMPRESCINDIBLES"
                4. Salir
                Introduzca la opción deseada:\s"""));

        switch (opcion) {
            case 1: // Pintar HEROES
                palabraElegida = "HEROES";
                break;
            case 2: // Pintar GRACIAS
                palabraElegida = "GRACIAS";
                break;
            case 3: // Pintar IMPRESCINDIBLES
                palabraElegida = "IMPRESCINDIBLES";
                break;
            case 4: // Salir
                IO.println("Cerrando el programa...");
                break;
            default:
                IO.readln("Opción inválida. Pulsa enter para volver a intentarlo.");
        }

        // Código que pinta la pirámide.
        if (!palabraElegida.isEmpty()) {
            altura = palabraElegida.length();
            elementos = 1;
            espacios = altura - 1;

            for (int fila = 1; fila <= altura ; fila++) { // Pintamos la altura.
                for (int hueco = 1; hueco <= espacios ; hueco++) { // Pintamos los espacios.
                    IO.print(" ");
                }

                for (int caracter = 1; caracter <= elementos; caracter++) { // Pintamos los elementos.
                    // Si fila y caracter valen igual, están en el centro de la pirámide, y pintamos el carácter correspondiente de la palabra.
                    if (fila == caracter) IO.print(palabraElegida.charAt(fila - 1));
                    else IO.print("*");
                }

                // Preparamos para la siguiente fila.
                elementos += 2;
                espacios--;
                IO.println();
            }

            IO.readln("Pulse una tecla para continuar.");
        }


    } while (opcion != 4);
}