void main() {
    // Pide una frase y di cuántas palabras tiene. Las palabras pueden estar separadas por más de un espacio, y puede haber espacios al principio y al final.
    // Además, vamos a imprimir cada palabra.

    // Declaramos variables.
    String fraseOriginal = "   Hoy   hay  clase";
    String frase = fraseOriginal.trim(); // Le quitamos los espacios al principio y al final.
    int contador = 0;

    // Contamos las palabras.
    for (int i = 0; i < frase.length(); i++) {
        if (frase.charAt(i) == ' ' && frase.charAt(i+1) != ' ') contador++;
    }

    IO.println("Número de palabras: " + contador);

    // Ahora vamos a extraer las palabras.
}