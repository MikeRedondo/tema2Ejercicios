void main() {
    // Pide una hora (horas y minutos) y calcula cuántos segundos faltan para medianoche.

    int hora, minutos, horasRestantes, minutosRestantes, segundosRestantes;

    IO.println("*** CALCULA CUÁNTOS SEGUNDOS QUEDAN PARA LA MEDIANOCHE ***\n");

    hora = Integer.parseInt(IO.readln("Introduce la hora actual (de 0 a 23): "));
    minutos = Integer.parseInt(IO.readln("Introduce los minutos actuales (de 0 a 59): "));

    horasRestantes = 23 - hora;
    minutosRestantes = 60 - minutos;

    if (minutosRestantes == 60) {
        horasRestantes += 1;
        minutosRestantes = 0;
    }

    segundosRestantes = (horasRestantes * 3600) + (minutosRestantes * 60);

    IO.println("Horas restantes: " + horasRestantes);
    IO.println("Minutos restantes: " + minutosRestantes);
    IO.println("Segundos restantes hasta la medianoche: " + segundosRestantes + ".");
}