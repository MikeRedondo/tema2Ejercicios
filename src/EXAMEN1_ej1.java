void main() {

    // INICIO DE APP Y LOGIN

    // Declaramos variables.
    final String USUARIO = "Burns", CLAVE = "1234";
    String usuarioIntroducido, claveIntroducida;
    boolean logueado = false;
    int intentos = 3;

    // Iniciamos bucle del login.
    do {
        for (int i = 0; i < 100; i++) { // Limpiamos la pantalla.
            IO.println("");
        }

        // Pedimos datos.
        usuarioIntroducido = IO.readln("Usuario: ");
        claveIntroducida = IO.readln("Contraseña: ");

        if (usuarioIntroducido.equals(USUARIO) && claveIntroducida.equals(CLAVE)) { // Entrada exitosa.
            logueado = true;
        } else { // Entrada fallida.
            intentos--; // Perdemos un intento.
            IO.println("\nUsuario y/o contraseña incorrectos. Intentos restantes: " + intentos);

            if (intentos > 0) IO.readln("Pulsa enter para volver a intentarlo."); // Si todavía quedan intentos.
            else IO.println("ACCESO RESTRINGIDO"); // Si ya no quedan intentos.
        }

    } while (!logueado && intentos > 0);


    // MENÚ PRINCIPAL

    if (logueado) {
        boolean salir = false, primeraVez = true;
        int opcion;
        long ultimaCantidad = 0, ultimaOperacion = 0;

        for (int i = 0; i < 100; i++) { // Limpiamos la pantalla.
            IO.println("");
        }
        IO.println("¡BIENVENIDO AL SISTEMA!\n");

        do {
            // Mostramos el menú principal
            opcion = Integer.parseInt(IO.readln("""
                MENÚ PRINCIPAL
                1. Pasar una cantidad de decimal a binario
                2. Ver el resultado de la última operación
                3. Ver el usuario y clave por defecto
                4. Salir
                
                Introduce una opción:\s"""));

            switch (opcion) {
                case 1: // Opción 1: Pasar una cantidad de decimal a binario.

                    for (int i = 0; i < 100; i++) { // Limpiamos la pantalla.
                        IO.println("");
                    }

                    // Declaramos variables.
                    long num, cifraBinaria, potenciador = 0, numBinario = 0;

                    // Pedimos datos.
                    num = Integer.parseInt(IO.readln("Introduce una cantidad en decimal: "));
                    ultimaCantidad = num; // Guardamos el número para la opción 2 del menú principal.

                    // Convertimos el número decimal a binario, sacando los 1 y 0 de derecha a izquierda.
                    do {
                        cifraBinaria = num % 2; // Obtenemos la cifra: 1 o 0.
                        numBinario = (long) (numBinario + cifraBinaria * Math.pow(10, potenciador)); // Añadimos la cifra en la posición correcta del número binario.
                        potenciador++; // Aumentamos el potenciador para que la siguiente cifra se coloque en la posición de la izquierda.
                        num /= 2; // Dividimos el número para prepararlo para el siguiente bucle.
                    } while (num > 0);

                    ultimaOperacion = numBinario; // Guardamos el resultado para la opción 2 del menú principal.
                    primeraVez = false; // Cambiamos la bandera para la opción 2.

                    // Mostramos el resultado.
                    IO.println("Resultado en binario: " + numBinario);

                    IO.readln("\nPulsa enter para volver al menú principal.");

                    for (int i = 0; i < 100; i++) { // Limpiamos la pantalla.
                        IO.println("");
                    }
                    break;

                case 2: // Opción 2: Ver el resultado de la última operación.

                    for (int i = 0; i < 100; i++) { // Limpiamos la pantalla.
                        IO.println("");
                    }

                    if (primeraVez) {
                        IO.readln("""
                            TODAVÍA NO SE HAN REALIZADO OPERACIONES
                            
                            Pulsa enter para volver al menú principal.""");
                    } else {
                        IO.readln("""
                        RESULTADO DE LA ÚLTIMA OPERACIÓN
                        
                        Cantidad introducida: %d
                        Resultado binario: %d
                        
                        Pulsa enter para volver al menú principal.""".formatted(ultimaCantidad, ultimaOperacion));
                    }

                    for (int i = 0; i < 100; i++) { // Limpiamos la pantalla.
                        IO.println("");
                    }
                    break;

                case 3: // Opción 3: Ver el usuario y clave por defecto.

                    for (int i = 0; i < 100; i++) { // Limpiamos la pantalla.
                        IO.println("");
                    }

                    IO.readln("""
                        USUARIO Y CONTRASEÑA POR DEFECTO
                        
                        Usuario:    %s
                        contraseña: %s
                        
                        Pulsa enter para volver al menú principal.""".formatted(USUARIO, CLAVE));

                    for (int i = 0; i < 100; i++) { // Limpiamos la pantalla.
                        IO.println("");
                    }
                    break;

                case 4: // Opción 4. Salir.
                    IO.println("¡Adios!");
                    salir = true;
                    break;

                default:
                    IO.readln("ERROR: Opción inválida. Pulsa enter para volver a intentarlo.");
                    for (int i = 0; i < 100; i++) { // Limpiamos la pantalla.
                        IO.println("");
                    }
            }
        } while (!salir);
    }
}