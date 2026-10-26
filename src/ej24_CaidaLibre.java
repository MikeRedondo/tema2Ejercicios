void main() {
    // Calcula el tiempo que tarda en caer un objeto desde una altura h, con la fórmula tiempo = raíz cuadrada de (2h / g), tomando g = 9,81 m/s².

    double tiempo, altura;
    final double GRAVEDAD = 9.81;

    IO.println("*** CALCULA EL TIEMPO QUE TARDA EN CAER UN OBJETO ***");

    altura = Double.parseDouble(IO.readln("Introduce la altura en metros desde la que cae el objeto: "));

    tiempo = Math.sqrt((2 * altura) / GRAVEDAD);

    IO.println("El objeto tardará %.2f segundos en caer.".formatted(tiempo));
}