void main() {
    // Muestra los números del 320 al 160, de 20 en 20 hacia atrás. Hazlo tres veces: con for, con while y con do-while.

    // Con for.
    IO.println("Bucle usando 'for':");
    for (int i = 320; i >= 160; i -= 20) {
        IO.print(i + ((i == 160) ? "" : " -> "));
    }

    // Con while.
    IO.println("\n\nBucle usando 'while':");
    int numeroWhile = 320;
    while (numeroWhile >= 160) {
        IO.print(numeroWhile + ((numeroWhile == 160) ? "" : " -> "));
        numeroWhile -= 20;
    }

    // Con do-while.
    IO.println("\n\nBucle usando 'do-while':");
    int numeroDo = 320;
    do {
        IO.print(numeroDo + ((numeroDo == 160) ? "" : " -> "));
        numeroDo -= 20;
    } while (numeroDo >= 160);
}