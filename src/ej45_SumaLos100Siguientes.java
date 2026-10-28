void main() {
    // Pide un número entero positivo y suma los 100 números siguientes a él.

    // Inicializamos variables.
    int num, suma = 0;

    // Pedimos datos.
    do {
        num = Integer.parseInt(IO.readln("Introduce un número entero positivo: "));
        if (num < 0) IO.println("ERROR: El número debe ser positivo.");
    } while (num < 0);

    // Sumamos 1 al número para que empecemos a sumar desde el número siguiente.
    num++;

    // Calculamos con un bucle.
    for (int i = 1; i <= 100 ; i++) {
        IO.println(suma);
        suma += num++;
    }

    // Mostramos la suma final.
    IO.println("Suma: " + suma);
}