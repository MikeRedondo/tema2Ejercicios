void main() {
    // Pide una frase y di cuántas vocales tiene. Cuentan las mayúsculas y las que llevan tilde o diéresis.

    // Declaramos variables.
    final String LETRAS_BUSCADAS = "aeiouáéíóúäëïöü";
    String fraseOriginal = "Programación en Java";
    int contadorVocales = 0;

    // Primero le quitamos las mayúsculas.
    String fraseMinuscula = fraseOriginal.toLowerCase();

    // Comprobamos cada caracter de la frase.
    for (int i = 0; i < fraseMinuscula.length(); i++) {
        if (LETRAS_BUSCADAS.contains(String.valueOf(fraseOriginal.charAt(i)))) contadorVocales++;
    }

    // Mostramos los datos.
    IO.println("'" + fraseOriginal + "'");
    IO.println("Número de vocales: " + contadorVocales);
}