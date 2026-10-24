void main() {
    // Pide una cantidad de segundos y muéstrala como horas, minutos y segundos. Por ejemplo, 3725 → 1 h 2 min 5 s.

    int segundosIntroducidos, horas, minutos, segundos;

    segundosIntroducidos = Integer.parseInt(IO.readln("Introduce una cantidad de segundos: "));

    horas = segundosIntroducidos / 3600;
    minutos = (segundosIntroducidos % 3600) / 60;
    segundos = segundosIntroducidos % 60;

    IO.println("%d segundos son %dh, %dmin y %ds.".formatted(segundosIntroducidos, horas, minutos, segundos));

}