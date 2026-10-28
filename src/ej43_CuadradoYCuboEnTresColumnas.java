void main() {
    // Muestra en tres columnas el número, su cuadrado y su cubo, para los 5 primeros enteros.

    IO.println("%-10s%-16s%s".formatted("Número", "Cuadrado", "Cubo"));
    IO.println("------------------------------");

    for (int i = 1; i <= 5 ; i++) {
        double cuadrado = Math.pow(i, 2);
        double cubo = Math.pow(i, 3);
        IO.println("%6d%12.0f%12.0f".formatted(i, cuadrado, cubo));
    }
}