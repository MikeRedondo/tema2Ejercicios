void main() {
    // Pide un número de 5 cifras y muestra sus dígitos separados, uno por línea. Por ejemplo, con 37231 debe salir 3, 7, 2, 3 y 1.

    int num = Integer.parseInt(IO.readln("Introduce un número de 5 cifras: "));
    int numAbsoluto = Math.abs(num);
    String numString = String.valueOf(numAbsoluto);

    if (numString.length() != 5) {
        IO.println("ERROR: El número debe tener exactamente 5 cifras.");
    } else {
        IO.println(numString.charAt(0));
        IO.println(numString.charAt(1));
        IO.println(numString.charAt(2));
        IO.println(numString.charAt(3));
        IO.println(numString.charAt(4));
    }
}