void main() {
    // Pide dos números y di cuál es mayor, usando el operador ternario.

    int num1, num2, mayor, menor;

    IO.println("*** COMPARA DOS NÚMEROS PARA SABER CUAL ES EL MAYOR ***\n");

    num1 = Integer.parseInt(IO.readln("Introduce el primer número: "));
    num2 = Integer.parseInt(IO.readln("Introduce el segundo número: "));

    mayor = (num1 > num2) ? num1 : num2;
    menor = (num1 > num2) ? num2 : num1;

    IO.println("%d es mayor que %d.".formatted(mayor, menor));
}