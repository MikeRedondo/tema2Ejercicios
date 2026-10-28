void main() {
    // Pide números hasta que el usuario escriba uno negativo. Al terminar, di cuántos ha metido y cuál es su media (sin contar el negativo).

    // Inicializamos variables.
    int num, cantidad = 0;
    double media = 0;

    // Pedimos los datos y vamos actualizando el contador de cantidad.
    do {
        num = Integer.parseInt(IO.readln("Introduce un número positivo para contabilizarlo, o negativo para terminar: "));
        if (num >= 0) {
            cantidad++;
            media += num;
        }
    } while (num >= 0);

    // Terminamos de calcular la media dividiendo la suma acumulada entre la cantidad de números introducidos.
    if (cantidad != 0) media /= cantidad;

    // Mostramos los resultados.
    IO.println("\nHas introducido %d números.".formatted(cantidad));
    if (media != 0) IO.println("La media de todos los números introducidos es %.2f.".formatted(media));
}