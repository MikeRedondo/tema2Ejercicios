void main() {
    // Pide una hora (solo la hora, sin minutos) y saluda: buenos días de 6 a 12, buenas tardes de 13 a 20, y buenas noches de 21 a 5.

    int hora;

    IO.println("*** SALUDA SEGÚN LA HORA ***\n");

    hora = Integer.parseInt(IO.readln("¿Qué hora es? (0-23): "));

    if (hora >= 6 && hora <= 12) {
        IO.println("¡Buenos días!");
    } else if (hora >= 13 && hora <= 20) {
        IO.println("¡Buenas tardes!");
    } else {
        IO.println("¡Buenas noches!");
    }
}