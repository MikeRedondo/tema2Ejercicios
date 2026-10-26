void main() {
    // Amplía el cálculo del salario para considerar las horas extra. Se piden las horas base y las extra. Las horas base se pagan a 10 € hasta 150 horas; a partir de 151, a 11 €. Las extra van a 13 €.

    // Inicializamos las variables
    int horasBase, horasExtra, sueldoBase, sueldoExtra, sueldoTotal;

    // Pedimos los datos
    horasBase = Integer.parseInt(IO.readln("Introduce las horas base: "));
    horasExtra = Integer.parseInt(IO.readln("Introduce las horas extra: "));

    // Calculamos el sueldo base
    if (horasBase <= 150) {
        // Si las horas base son menor o igual a 150, se multiplican por 10
        sueldoBase = horasBase * 10;
    } else {
        // Las primeras 150 horas se multiplican por 10, y las demás por 11
        sueldoBase = 1500 + ((horasBase - 150) * 11);
    }

    // Calculamos el sueldo extra
    sueldoExtra = horasExtra * 13;

    // Calculamos el sueldo total
    sueldoTotal = sueldoBase + sueldoExtra;

    // Mostramos el resultado del sueldo total
    IO.println("Tu sueldo total son %,d €.".formatted(sueldoTotal));
}