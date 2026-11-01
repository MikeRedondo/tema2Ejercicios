void main() {
    // Pide un número y di si es primo.

    // Declaramos variables.
    int num;
    boolean primo = true;

    // Pedimos y validamos los datos.
    num = Integer.parseInt(IO.readln("Introduce un número: "));

    if (num < 2) primo = false;

    // Iniciamos el bucle.
    for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
        if (num % divisor == 0) {
            primo = false;
            break;
        }
    }

    IO.println(primo ? "Es primo." : "No es primo.");
}