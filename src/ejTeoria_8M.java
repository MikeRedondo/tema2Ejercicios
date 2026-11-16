void main() {

    // Declaramos variables.
    int altura;

    // Pedimos datos
    do {
        for (int i = 0; i < 100; i++) { // Limpiamos la pantalla
            IO.println();
        }

        altura = Integer.parseInt(IO.readln("Introduzca la altura (impar y mayor o igual a 5): "));
        if (altura % 2 == 0 || altura < 5) IO.readln("ERROR: Altura inválida. Pulsa enter para reintentarlo.");

    } while (altura % 2 == 0 || altura < 5);

    // Pintamos el 8.
    for (int fila = 1; fila <= altura; fila++) { // Pintamos cada fila

        if (fila == 1 || fila == altura || fila == (altura / 2) + 1) { // Es una fila sin huecos.
            IO.println("MMMMMM");
        } else { // Es una fila con huecos.
            IO.println("M    M");
        }
    }

}