void main() {
    // Pide una frase, un carácter y otro carácter. Muestra la frase con el primero cambiado por el segundo, y di cuántos cambios ha hecho. Sin usar replace.

    // Declaramos variables.
    String fraseOriginal, fraseNueva = "";
    char caracterBuscado, caracterNuevo;

    // Pedimos datos.
    fraseOriginal = IO.readln("Escribe una frase: ");
    caracterBuscado = IO.readln("Introduce el carácter que vas a reemplazar: ").charAt(0);
    caracterNuevo = IO.readln("Introduce el carácter que lo va a sustituir: ").charAt(0);

    // Miramos cada caracter, si no es el buscado lo copiamos, si lo es escribimos el nuevo.
    for (int i = 0; i < fraseOriginal.length(); i++) {
        if (fraseOriginal.charAt(i) != caracterBuscado) {
            fraseNueva = fraseNueva + fraseOriginal.charAt(i);
        } else fraseNueva = fraseNueva + caracterNuevo;
    }

    IO.println(fraseOriginal);
    IO.println(fraseNueva);

}