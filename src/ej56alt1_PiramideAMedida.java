void main() {
    // Pide la altura y dos caracteres, y dibuja una pirámide rellena usando un caracter en cada fila de manera alterna.

    // Declaramos variables.
    int altura, numeroCaracteres = 1, espacios;
    char caracterA, caracterB;

    // Pedimos los datos.
    altura = Integer.parseInt(IO.readln("Introduce la altura de la pirámide: "));
    caracterA = (IO.readln("Introduce el primer carácter: ")).charAt(0);
    caracterB = (IO.readln("Introduce el segundo carácter: ")).charAt(0);
    espacios = altura -1;

    IO.println(); // Dejamos una línea vacía.

    // Pintamos la pirámide completa.
    for (int i = 0; i < altura; i++) {
        for (int j = 0; j < espacios; j++) {
            IO.print(" ");
        }
        for (int j = 0; j < numeroCaracteres; j++) {
            IO.print(i % 2 == 0 ? caracterA : caracterB);
        }
        IO.println();
        numeroCaracteres += 2;
        espacios--;
    }
}