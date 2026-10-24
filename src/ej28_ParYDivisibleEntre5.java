void main() {
    // Pide un número y di si es par, si es divisible entre 5, si es las dos cosas o si no es ninguna.

    int num;
    boolean par, cinco;

    IO.println("*** COMPRUEBA SI UN NÚMERO ES PAR O DIVISIBLE ENTRE 5 ***\n");

    num = Integer.parseInt(IO.readln("Introduce un número: "));
    par = num % 2 == 0;
    cinco = num % 5 == 0;

    if (par && cinco) {
        IO.println("%d es par y divisible entre 5.".formatted(num));
    } else if (par) {
        IO.println("%d es par pero no divisible entre 5.".formatted(num));
    } else if (cinco) {
        IO.println("%d es divisible entre 5 pero no par.".formatted(num));
    } else {
        IO.println("%d no es par ni divisible entre 5.".formatted(num));
    }
}