void main() {
    // Pide una hora (horas y minutos) y calcula cuántos segundos faltan para medianoche.

    // Inicializamos variables
    int hora, minutos, horasRestantes, minutosRestantes, segundosRestantes;

    IO.println("*** CALCULA CUÁNTOS SEGUNDOS QUEDAN PARA LA MEDIANOCHE ***\n");

    do {
        // Pedimos datos
        hora = Integer.parseInt(IO.readln("Introduce la hora actual (de 0 a 23, o -1 para finalizar el programa): "));

        // Solo continuamos si el usuario no introduce -1
        if (hora != -1) {
            minutos = Integer.parseInt(IO.readln("Introduce los minutos actuales (de 0 a 59): "));

            // Cálculos iniciales
            horasRestantes = 23 - hora;
            minutosRestantes = 60 - minutos;

            // Si faltan 60 minutos, los convertimos en 1 hora
            if (minutosRestantes == 60) {
                horasRestantes += 1;
                minutosRestantes = 0;
            }

            // Cálculo final
            segundosRestantes = (horasRestantes * 3600) + (minutosRestantes * 60);

            // Mostramos resultados
            IO.println("Horas restantes hasta la medianoche: " + horasRestantes);
            IO.println("Minutos restantes hasta la medianoche: " + minutosRestantes);
            IO.println("Segundos restantes hasta la medianoche: " + segundosRestantes);
        }
    } while (hora != -1);

}