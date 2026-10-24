void main() {
    // Ejemplo sencillo de pedir información en Java.

    String nombre = IO.readln("¿Cómo te llamas? ");
    IO.println("Hola %s.".formatted(nombre));

    String edad = IO.readln("¿Cuántos años tienes? ");
    int edadValida = Integer.parseInt(edad);
    IO.println("Tienes %s años.".formatted((edadValida)));

    // Pedimos la nota de Sistemas en una sola línea.

    double nota = Double.parseDouble(IO.readln("¿Cuál fue tu nota de Sistemas? "));
    IO.println("Sacaste un %.1f en sistemas.".formatted((nota)));
}