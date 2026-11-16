void main() {
    String frase = "En este examen, Carlos ha ido a pillar";
    String fraseCopia = frase, palabra;
    int ancho = 0;

    // Sacamos palabra a palabra para ver cual es la más larga.
    do {
        if (!frase.contains(" ")) {
            palabra = frase;
            frase = ""; // Forzamos la salida del bucle.
        } else {
            palabra = frase.substring(0, frase.indexOf(' '));
        }

        if (ancho < palabra.length()) ancho = palabra.length();

        // Sacamos la palabra de la frase.
        frase = frase.substring(frase.indexOf(' ') + 1);
    } while (!frase.isEmpty());

    IO.println("El ancho del marco es: " + ancho);
}