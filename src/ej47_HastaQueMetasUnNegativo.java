void main() {
    // Pide números hasta que el usuario escriba uno negativo. Al terminar, di cuántos ha metido y cuál es su mediaNumeros (sin contar el negativo).

    // Inicializamos variables.
    int num, contadorNumeros = 0, sumaNumeros = 0;
    double mediaNumeros = 0;

    // Pedimos los datos y vamos actualizando el contador de contadorNumeros.
    do {
        num = Integer.parseInt(IO.readln("Introduce un número positivo para contabilizarlo, o negativo para terminar: "));
        if (num >= 0) {
            contadorNumeros++;
            sumaNumeros += num;
        }
    } while (num >= 0);

    // Terminamos de calcular la mediaNumeros dividiendo la suma acumulada entre la contadorNumeros de números introducidos.
    if (contadorNumeros != 0) mediaNumeros = (double) sumaNumeros / contadorNumeros;

    // Mostramos los resultados.
    IO.println("\nHas introducido %d números.".formatted(contadorNumeros));
    if (mediaNumeros != 0) IO.println("La media de todos los números introducidos es %.2f.".formatted(mediaNumeros));
}