void main() {
    // Declara dos variables enteras con los valores 144 y 999. Muestra su suma, resta, multiplicación, división entera y resto.

    int num1 = 144;
    int num2 = 999;

    IO.println("%d + %d = %d".formatted(num1, num2, (num1 + num2)));
    IO.println("%d - %d = %d".formatted(num1, num2, (num1 - num2)));
    IO.println("%d * %d = %d".formatted(num1, num2, (num1 * num2)));
    IO.println("%d / %d = %f".formatted(num1, num2, ((double) num1 / num2)));
    IO.println("%d %% %d = %d".formatted(num1, num2, (num1 % num2)));
}