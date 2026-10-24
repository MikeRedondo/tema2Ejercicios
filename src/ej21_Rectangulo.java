void main() {
    // Pide la base y la altura de un rectángulo y calcula su área y su perímetro.

    double base, altura, area, perimetro;

    IO.println("*** CALCULA EL ÁREA Y PERÍMETRO DE UN RECTÁNGULO ***\n");

    base = Double.parseDouble(IO.readln("Introduce la base del rectángulo: "));
    altura = Double.parseDouble(IO.readln("Introduce la altura del rectángulo: "));

    area = base * altura;
    perimetro = (base * 2) + (altura * 2);

    IO.println("---------------------");
    IO.println("%-10s %10.2f".formatted("Área:", area));
    IO.println("%-10s %10.2f".formatted("Perímetro:", perimetro));
}