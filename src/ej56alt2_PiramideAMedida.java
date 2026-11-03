void main() {
    // Pide la altura y el carácter, y dibuja una pirámide rellena dejando un espacio entre cada carácter.

    // Declaramos variables.
    int altura, numeroCaracteres = 1, espacios;
    char caracter;

    // Pedimos los datos.
    altura = Integer.parseInt(IO.readln("Introduce la altura de la pirámide: "));
    caracter = (IO.readln("Introduce el carácter: ")).charAt(0);
    espacios = altura - 1;

    IO.println(); // Dejamos una línea vacía.

        // Pintamos la pirámide completa.
    for (int i = 0; i < altura; i++) {
        for (int j = 0; j < espacios; j++) {
            IO.print("  ");
        }
        for (int j = 0; j < numeroCaracteres; j++) {
            IO.print(caracter + " ");
        }
        IO.println();
        numeroCaracteres += 2;
        espacios--;
    }
}