void main() {
    // Muestra todos los números del 0 al 100 que son múltiplos de 5 pero no de 3.

    for (int i = 0; i <= 100; i++) {
        if (i % 5 == 0 && i % 3 != 0) {
            IO.print(i + ((i >= 100) ? "" : " -> "));
        }
    }
}