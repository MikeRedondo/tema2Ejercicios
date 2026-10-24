void main() {
    // Resuelve ax + b = 0 pidiendo a y b por teclado. Cuidado con el caso en que a valga 0.

    double a, b, x;

    IO.println("*** RESUELVE UNA ECUACIÓN DE PRIMER GRADO ***");
    IO.println("ax + b = 0\n");

    a = Double.parseDouble(IO.readln("Introduce al valor de 'a': "));
    b = Double.parseDouble(IO.readln("Introduce al valor de 'b': "));

    x = -b / a;

    IO.println("x = " + x);
}