void main() {
    // Muestra los números del 0 al 100 que son múltiplos de 2 pero no de 6.

    for (int i = 0; i <= 100; i += 2) {
        if (i % 6 != 0) IO.print(i + " ");
    }
}