void main() {
    // Pide una frase y di cuántos espacios tiene.

    int numeroEspacios = 0;
    String cadena = "Hola, estamos en clase.";

    for (int i = 0; i < cadena.length(); i++) {
        if (cadena.charAt(i) == ' ') numeroEspacios++;
    }

    IO.println("El número de espacios es: " + numeroEspacios);
}