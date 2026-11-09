void main() {
    // Pide números positivos hasta que el usuario meta uno negativo. Al terminar, di cuántos ha metido, el mayor, el menor y la media, sin contar el negativo.

    // Declaramos variables.
    int num, contadorNumeros = 0, mayor = -1, menor = Integer.MAX_VALUE, suma = 0;
    double media;

    // Pedimos datos.
    do {
        num = Integer.parseInt(IO.readln("Introduce un número positivo  para calcular, o uno negativo para terminar: "));

        if (num >= 0) {
            contadorNumeros++;
            if (num > mayor) mayor = num; // mayor = Math.max(mayor, num);
            if (num < menor) menor = num; // menor = Math.min(menor, num);
            suma += num;
        }
    } while (num >= 0);

    media = (double) suma / contadorNumeros;

    // Imprimimos los resultados.
    if (contadorNumeros == 0) IO.println("No se ha introducido ningún número positivo.");
    else {
        IO.println("Has introducido " + contadorNumeros + " números.");
        IO.println("El número mayor es " + mayor);
        IO.println("El número menor es " + menor);
        IO.println("La media de todos los números es " + media);
    }

}