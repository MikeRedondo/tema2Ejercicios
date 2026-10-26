void main() {
    // Pide un día de la semana y di qué asignatura toca a primera hora. Los fines de semana, avisa de que no hay clase.

    // Inicializamos variables
    String dia, asignatura;

    // Pedimos datos
    dia = IO.readln("Introduce el día de la semana para saber que asignatura toca a primera hora: ");
    dia = dia.toLowerCase();

    asignatura = switch (dia) {
        case "lunes", "viernes" -> "Bases de datos";
        case "martes" -> "IPE 1";
        case "miércoles", "miercoles" -> "Sistemas";
        case "jueves" -> "Lenguaje de marcas";
        case "sábado", "sabado", "domingo" -> "Ese día no hay clase";
        default -> "Ese día no existe.";
    };

    IO.println(asignatura);

}