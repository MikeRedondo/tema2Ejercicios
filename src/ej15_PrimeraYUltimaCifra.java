void main() {
    // Pide un número entero de hasta cinco cifras y muestra su última cifra y su primera cifra.

    int num = 0, numAbsoluto = 0, longitudNum = 0, primeraCifra = 0, ultimaCifra = 0;
    String numString;
    double divisor = 0;

    num = Integer.parseInt(IO.readln("Introduce un número de hasta cinco cifras: "));
    //  Guardamos el número como valor absoluto por si fuese negativo.
    numAbsoluto = Math.abs(num);
    numString = String.valueOf(numAbsoluto);
    longitudNum = numString.length();

    //  Comprobamos que no tenga más de 5 cifras.
    if (longitudNum > 5){
        IO.print("ERROR: El número no puede tener más de cinco cifras.");
    }else {
        divisor = Math.pow(10, longitudNum - 1);
        primeraCifra = numAbsoluto / (int) divisor;
        ultimaCifra = numAbsoluto% 10;

        IO.println("La última cifra de %d es %d.".formatted(num, ultimaCifra));
        IO.println("La primera cifra de %d es %d.".formatted(num, primeraCifra));
    }
}