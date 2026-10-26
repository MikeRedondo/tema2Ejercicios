void main() {
    // Pide una nota del 0 al 10 y muestra la calificación: insuficiente, suficiente, bien, notable o sobresaliente.

    // Inicializamos variables.
    double nota = -1;

    // Pedimos y validamos los datos.
    do {
        nota = Double.parseDouble(IO.readln("Introduce tu nota: "));
        if (nota < 0 || nota > 10) {
            IO.println("ERROR: La nota debe ser de 0 a 10.");
        }
    } while (nota < 0 || nota > 10);

    // Mostramos la calificación según la nota introducida.
    if (nota < 5) {
        IO.println("Insuficiente.");
    } else if (nota < 6) {
        IO.println("Suficiente.");
    } else if (nota < 7) {
        IO.println("Bien.");
    } else if (nota < 9) {
        IO.println("Notable.");
    } else {
        IO.println("Sobresaliente.");
    }
}