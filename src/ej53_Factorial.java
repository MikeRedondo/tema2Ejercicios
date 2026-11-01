void main() {
    // Pide un número entero positivo y calcula su factorial. Recuerda que 5! = 5 × 4 × 3 × 2 × 1.

    // Declaramos variables.
    int num;
    long factorial;

    // Pedimos los datos.
    do {
        num = Integer.parseInt(IO.readln("Introduce un número para calcular su factorial: "));
        if (num < 1) {
            IO.println("ERROR: El número debe ser mayor que 0.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 50; i++) IO.println("");
        }
    } while (num < 1);

    factorial = num;
    IO.print("\n%d! = %d".formatted(num, num));

    // iniciamos el bucle del cálculo.
    for (int i = (num - 1); i > 0 ; i--) {
        factorial *= i;
        IO.print(" x " + i);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Mostramos el resultado final.
    IO.println("\n%d! = %,d".formatted(num, factorial));
}