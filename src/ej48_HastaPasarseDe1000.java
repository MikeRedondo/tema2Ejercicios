void main() {
    // Pide números y ve sumándolos mientras la suma no pase de 1000. Cuando se pase, di cuántos números han hecho falta.

    // Inicializamos variables.
    int num, suma = 0, contadorNumeros = 0;

    // Iniciamos bucle y pedimos datos.
    do {
        num = Integer.parseInt(IO.readln("Introduce un número: "));
        suma += num;
        contadorNumeros++;
    } while (suma <= 1000);

    // Mostramos los datos.
    IO.println("\nSuma final: %,d".formatted(suma));
    IO.println("Han hecho falta %d números para sumar más de 1.000.".formatted(contadorNumeros));
}