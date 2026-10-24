void main() {
    // Este programa tiene seis errores. Encuéntralos y corrígelo.

    /*
    void main() {
        int x = 7
        int y = 5;
        float f1 = 13.5;
        String nombre = 'Carlos';
        IO.println("El valor de x es ", x);
        IO.println("La división es " + x / y);
        IO.println("¿Iguales? " + nombre == "Carlos");
    }
     */

    int x = 7; // Faltaba el punto y coma.
    int y = 5;
    float f1 = 13.5f; // Faltaba una f después del número.
    String nombre = "Carlos"; // Para strings se usan comillas dobles.
    IO.println("El valor de x es " + x); // Para concatenar usamos el símbolo de sumar.
    IO.println("La división es " + (x / y)); // Encerramos la división entre paréntesis para que se calcule antes de concatenar.
    IO.println("¿Iguales? " + nombre.equals("Carlos")); // Los strings se comparan con el método .equals().
}