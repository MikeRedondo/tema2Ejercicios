void main() {
    // Pide un número y después un dígito. Di en qué posición o posiciones aparece ese dígito dentro del número, contando de izquierda a derecha.

    int num, numAux, longitudNumero = 0, divisor, cifraImprimir, digitoBuscado, posicionCifra = 1;
    boolean digitoEncontrado = false;

    // Pedimos los datos.
    num = Integer.parseInt(IO.readln("Introduce un número: "));
    numAux = num;

    // Pedimos el dígito validando que esté entre 0 y 9.
    do {
        digitoBuscado = Integer.parseInt(IO.readln("Introduce el dígito que quieres buscar: "));
        if (digitoBuscado < 0 || digitoBuscado > 9) IO.println("\nERROR: El dígito debe estar entre 0 y 9.");
    } while (digitoBuscado < 0 || digitoBuscado > 9);

    // Cómo sacar números de izquierda a derecha.

    // 1. Calculamos la longitud del número.
    do {
        num = num / 10;
        longitudNumero++;
    } while (num > 0);

    num = numAux;
//    IO.println("Longitud del número: " + longitudNumero);

    // 2. Calculamos el primer divisor necesario.
    divisor = (int) Math.pow(10, (longitudNumero - 1));

    // 3. Hacemos el bucle para dividir el número entre el divisor, y asi sacar las cifras de izquierda a derecha.
    do {
        cifraImprimir = num / divisor;
//        IO.print(cifraImprimir + " - ");
        if (cifraImprimir == digitoBuscado) {
            IO.println("EL dígito buscado está en la posición " + posicionCifra);
            digitoEncontrado = true;
        }
        // Preparamos las variables para la siguiente vuelta del bucle.
        num %= divisor;
        divisor /= 10;
        posicionCifra++;
    } while (num > 0);

    // 4. Comprobamos la bandera para saber si hemos encontrado la cifra.
    if (!digitoEncontrado) IO.println("El dígito buscado no está en el número.");






}