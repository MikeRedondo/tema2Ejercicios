void main() {
    // Pide una palabra y muéstrala al revés. Si se lee igual en los dos sentidos, dilo, sin que importen las mayúsculas.

    // Declaramos variables.
    String palabraOriginal = "Reconocer", palabraInvertida = "";

    for (int i = palabraOriginal.length() - 1; i >= 0 ; i--) {
        palabraInvertida = palabraInvertida + palabraOriginal.charAt(i);

    }

    IO.println("""
            Palabra original:  %s
            Palabra invertida: %s
            Se lee %s en los dos sentidos.
            """.formatted(palabraOriginal, palabraInvertida, (palabraOriginal.equalsIgnoreCase(palabraInvertida) ? "igual" : "distinto")));
}