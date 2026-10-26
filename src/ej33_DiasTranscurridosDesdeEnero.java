void main() {
    // Pide un día y un mes y calcula cuántos días han pasado desde el 1 de enero. No hace falta que tengas en cuenta los años bisiestos.

    // Inicializamos variables.
    int dia = 0, mes = 0, maxDiasMes, diasTranscurridos;

    // Pedimos el mes, validamos que sea un número entre 1 y 12, y repetimos el proceso si no.
    do {
        mes = Integer.parseInt(IO.readln("Introduce el mes (1-12): "));
        if (mes < 1 || mes > 12) {
            IO.println("ERROR: Número de mes incorrecto.");
        }
    } while (mes < 1 || mes > 12);

    // Según el mes introducido, establecemos el número máximo de días que puede tener ese mes.
    maxDiasMes = switch (mes) {
        case 2 -> 28;
        case 4, 6, 9, 11 -> 30;
        case 1, 3, 5, 7, 8, 10, 12 -> 31;
        default -> 0;
    };

    // Pedimos el día, validamos que sea un número entre 1 y el número máximo de días del mes, y repetimos el proceso si no.
    do {
        dia = Integer.parseInt(IO.readln("Introduce el día (1-%d): ".formatted(maxDiasMes)));
        if (dia < 1 || dia > maxDiasMes) {
            IO.println("ERROR: Número de día incorrecto.");
        }
    } while (dia < 1 || dia > maxDiasMes);

    // Calculamos los días transcurridos según el mes y día introducidos.
    diasTranscurridos = switch (mes) {
        case 1 -> dia - 1;
        case 2 -> dia - 1 + 31;
        case 3 -> dia - 1 + 31 + 28;
        case 4 -> dia - 1 + 31 + 28 + 31;
        case 5 -> dia - 1 + 31 + 28 + 31 + 30;
        case 6 -> dia - 1 + 31 + 28 + 31 + 30 + 31;
        case 7 -> dia - 1 + 31 + 28 + 31 + 30 + 31 + 30;
        case 8 -> dia - 1 + 31 + 28 + 31 + 30 + 31 + 30 + 31;
        case 9 -> dia - 1 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        case 10 -> dia - 1 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        case 11 -> dia - 1 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        case 12 -> dia - 1 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
        default -> -1;
    };

    // Mostramos el resultado.
    if (diasTranscurridos == 1) {
        IO.println("El día %d/%d ha pasado 1 día desde el 1 de enero.".formatted(dia, mes));
    } else {
        IO.println("El día %d/%d han pasado %d días desde el 1 de enero.".formatted(dia, mes, diasTranscurridos));
    }
}