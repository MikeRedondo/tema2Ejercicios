void main() {
    // Haz un test de 5 preguntas que se contestan con «sí» o «no». Cada «sí» suma 3 puntos. Al final, según la puntuación, el programa da un consejo.

    // Incializamos variables
    int puntuacion = 0;

    // Primera pregunta.
    IO.println("¿Estudias al menos 2 horas cada día?");
    if (IO.readln("Responde 'si' o 'no': ").equalsIgnoreCase("si")) puntuacion += 3;

    // Segunda pregunta.
    IO.println("¿Estudias con el móvil apagado para evitar distracciones?");
    if (IO.readln("Responde 'si' o 'no': ").equalsIgnoreCase("si")) puntuacion += 3;

    // Tercera pregunta.
    IO.println("¿Tomas apuntes durante clase?");
    if (IO.readln("Responde 'si' o 'no': ").equalsIgnoreCase("si")) puntuacion += 3;

    // Cuarta pregunta.
    IO.println("¿Haces esquemas y resúmenes de lo aprendido?");
    if (IO.readln("Responde 'si' o 'no': ").equalsIgnoreCase("si")) puntuacion += 3;

    // Quinta pregunta.
    IO.println("¿Haces todos los deberes?");
    if (IO.readln("Responde 'si' o 'no': ").equalsIgnoreCase("si")) puntuacion += 3;

    // Según la puntuación obtenida, damos un consejo al usuario.
    switch (puntuacion) {
        case 0, 3:
            IO.println("Tienes unos hábitos desastrosos. ¡Tlabaja!");
            break;
        case 6, 9:
            IO.println("Tienes unos hábitos mejorables. ¡Espabila, que la vida te va a comer!");
            break;
        case 12, 15:
            IO.println("Tienes unos hábitos envidiables. ¡VAAAAMOOOOOOOOS!");
            break;
    }
}