void main() {
    // Pide dos números enteros y muestra todos los que hay entre ellos. Tiene que funcionar los des en el orden que los des.

    // Inicializamos variables.
    int num1, num2;

    //Pedimos los datos, y validamos que ambos números no sean iguales.
    do {
        num1 = Integer.parseInt(IO.readln("Introduce el primer número: "));
        num2 = Integer.parseInt(IO.readln("Introduce el segundo número: "));

        IO.println((num1 == num2) ? "ERROR: Los números deben ser distintos.\n" : "");
    } while (num1 == num2);

    for (int i = 0; i < 100; i++) {
        IO.println("");
    }

    IO.print("Cargando la cuenta ");
    for (int i = 0; i < 3; i++) {
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        IO.print(". ");
    }

    // Según que número es el mayor, iniciamos un bucle u otro, y mostramos el resultado.
//    if (num1 < num2) {
//        IO.println("\nEntre los números %d y %d hay los siguientes números:".formatted(num1, num2));
//        for (int i = (num1 + 1); i < num2 ; i++) {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            IO.print(i + ((i == (num2 - 1) ? "" : " -> ")));
//        }
//    }
//
//    if (num1 > num2) {
//        IO.println("\nEntre los números %d y %d hay los siguientes números:".formatted(num1, num2));
//        for (int i = (num1 - 1); i > num2 ; i--) {
//            IO.print(i + ((i == (num2 + 1) ? "" : " -> ")));
//        }
//    }

    // Solución de clase en un solo bucle.
    int valorInicial = (num1 < num2) ? num1 + 1 : num1 - 1;

    IO.println("\nEntre los números %d y %d hay los siguientes números:".formatted(num1, num2));

    for (int i = valorInicial; i != num2;) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        IO.print(i + ((i == (num2 - 1) || i == (num2 + 1) ? "" : " -> ")));
        i += (num1 < num2) ? 1 : -1;
    }

    IO.readln("\n\nPulsa enter para finalizar el programa.");
}