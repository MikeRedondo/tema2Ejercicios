void main() {
    // Lee diez números y di cuántos son positivos, cuántos negativos y cuántos cero.

    int positivos = 0, negativos = 0, ceros = 0;
    double num;

    IO.println("*** INTRODUCE 10 NÚMEROS Y COMPRUEBA CUANTOS SON POSITIVOS, NEGATIVOS O CERO ***\n");

    for (int i = 1; i <= 10 ; i++) {
        num = Double.parseDouble(IO.readln("Introduce un número (%d de 10): ".formatted(i)));
        if (num > 0) positivos++;
        if (num < 0) negativos++;
        if (num == 0) ceros++;
    }

    IO.println("""
            
            Números positivos:  %d
            Números negativos:  %d
            Iguales a cero:     %d
            """.formatted(positivos, negativos, ceros));
}