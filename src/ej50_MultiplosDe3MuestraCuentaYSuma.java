void main() {
    // Pide un número y muestra los múltiplos de 3 que hay entre 1 y ese número. Además, di cuántos son y cuánto suman.

    // Declaramos variables.
    int num, contadorNumeros = 0, sumaNumeros = 0;

    // Pedimos y validamos los datos.
    do {
        num = Integer.parseInt(IO.readln("Introduce un número mayor que 1: "));
        if (num <= 1) {
            IO.readln("ERROR: El número debe ser mayor que 1. Presiona cualquier tecla para reintentarlo.");
            for (int i = 0; i < 50; i++) IO.println("");
        }
    } while (num <= 1);

    // Iniciamos un bucle para comprobar todos los números entre 1 y num.
    // Mostramos los múltiplos de 3 y actualizamos las variables contadorNumeros y sumaNumeros.
    for (int i = 2; i < num; i++) {
        if (i % 3 == 0) {
            if (i == 3) IO.print("Múltiplos de 3: " + i);
            else IO.print(i <= (num - 4) ? ", " + i : " y " + i);
            contadorNumeros++;
            sumaNumeros += i;
        }
    }

    // Imprimimos los resultados finales.
    IO.println("\nSon %d números".formatted(contadorNumeros));
    IO.println("Su suma es %d.".formatted(sumaNumeros));



}