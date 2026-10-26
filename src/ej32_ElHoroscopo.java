void main() {
    // Pide el día y el mes de nacimiento y di el signo del zodiaco.

    // Inicializamos variables.
    int mes = 0, dia = 0, maxDiasMes;
    String signo;

    // Pedimos el mes de nacimiento, validamos que sea un número entre 1 y 12, y repetimos el proceso si no.
    do {
        mes = Integer.parseInt(IO.readln("Introduce tu més de nacimiento (1-12): "));
        if (mes < 1 || mes > 12) {
            IO.println("ERROR: Número de mes incorrecto.");
        }
    } while (mes < 1 || mes > 12);

    // Según el mes introducido, establecemos el número máximo de días que puede tener ese mes.
    maxDiasMes = switch (mes) {
        case 2 -> 29;
        case 4, 6, 9, 11 -> 30;
        case 1, 3, 5, 7, 8, 10, 12 -> 31;
        default -> 0;
    };

    // Pedimos el día de nacimiento, validamos que sea un número entre 1 y el número máximo de días del mes, y repetimos el proceso si no.
    do {
        dia = Integer.parseInt(IO.readln("Introduce tu día de nacimiento (1-%d): ".formatted(maxDiasMes)));
        if (dia < 1 || dia > maxDiasMes) {
            IO.println("ERROR: Número de día incorrecto.");
        }
    } while (dia < 1 || dia > maxDiasMes);

    // Asignamos el signo del zodiaco según el mes y día introducidos.
    signo = switch (mes) {
        case 1 -> (dia < 20) ? "Capricornio" : "Acuario";
        case 2 -> (dia < 19) ? "Acuario" : "Piscis";
        case 3 -> (dia < 21) ? "Piscis" : "Aries";
        case 4 -> (dia < 20) ? "Aries" : "Tauro";
        case 5 -> (dia < 21) ? "Tauro" : "Géminis";
        case 6 -> (dia < 21) ? "Géminis" : "Cáncer";
        case 7 -> (dia < 23) ? "Cáncer" : "Leo";
        case 8 -> (dia < 23) ? "Leo" : "Virgo";
        case 9 -> (dia < 23) ? "Virgo" : "Libra";
        case 10 -> (dia < 23) ? "Libra" : "Escorpio";
        case 11 -> (dia < 22) ? "Escorpio" : "Sagitario";
        case 12 -> (dia < 22) ? "Sagitario" : "Capricornio";
        default -> "ERROR: Número de mes incorrecto.";
    };

    // Mostramos el signo del usuario.
    IO.println("Tu signo del zodiaco es: %s.".formatted(signo));
}