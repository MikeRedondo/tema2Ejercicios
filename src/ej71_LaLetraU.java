void main() {
    // Pide la altura y pinta una letra U con asteriscos, de cinco columnas de ancho. La base lleva un espacio y dos asteriscos menos, para simular la curva de las esquinas.

    // declaramos variables.
    int altura;

    // Pedimos los datos.
    do {
        altura = Integer.parseInt(IO.readln("Introduce la altura de la U: "));
        if (altura < 2) IO.println("ERROR: La altura de be ser 2 o más.");
    } while (altura < 2);

    // Pintamos el cuerpo de la U sin la base.
    for (int i = 0; i < altura - 1; i++) {
        IO.println("*   *");
    }

    // Pintamos la base de la U.
    IO.println(" *** ");
}