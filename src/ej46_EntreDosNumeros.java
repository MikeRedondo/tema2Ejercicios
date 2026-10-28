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

    // Según que número es el mayor, iniciamos un bucle u otro, y mostramos el resultado.
    if (num1 < num2) {
        IO.println("Entre los números %d y %d hay los siguientes números:".formatted(num1, num2));
        for (int i = (num1 + 1); i < num2 ; i++) {
            IO.print(i + ((i == (num2 - 1) ? "" : " -> ")));
        }
    }

    if (num1 > num2) {
        IO.println("Entre los números %d y %d hay los siguientes números:".formatted(num1, num2));
        for (int i = (num1 - 1); i > num2 ; i--) {
            IO.print(i + ((i == (num2 + 1) ? "" : " -> ")));
        }
    }
}