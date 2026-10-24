void main() {
//    Realiza un conversor de euros a libras. La cantidad a convertir y el tipo de cambio tienen que estar cada uno en su variable, no escritos dentro del IO.println. Haz después la conversión inversa.

    String eurosString = IO.readln("Introduce la cantidad de euros: ");
    final double CAMBIO_EURO_A_LIBRA = 0.84;

//    Solución con String para que el número introducido no pueda tener más de 2 decimales.
    int posicionPunto = eurosString.indexOf('.');
    // IO.println(posicionPunto);
    String parteDecimal = eurosString.substring(posicionPunto + 1);
    if (parteDecimal.length() > 2 && posicionPunto != -1)
        IO.println("La cantidad no es válida");
    else {
        double euros = Double.parseDouble(eurosString);
        double libras = euros * CAMBIO_EURO_A_LIBRA;
        IO.println("%.2f€ son %.2f£.".formatted(euros, libras));
    }

    double dolares = Double.parseDouble(IO.readln("Introduce la cantidad de dólares: "));
    final double CAMBIO_DOLAR_A_EURO = 0.89;

//    IO.println("%.2f euros equivalen a %.2f dólares.".formatted(euros, (euros * CAMBIO_EURO_A_LIBRA)));
//    IO.println("%.2f euros equivalen a %.2f dólares.".formatted(euros, (euros / CAMBIO_DOLAR_A_EURO)));
//    IO.println("%.2f dólares equivalen a %.2f euros.".formatted(dolares, (dolares * CAMBIO_DOLAR_A_EURO)));
//    IO.println("%.2f dólares equivalen a %.2f euros.".formatted(dolares, (dolares / CAMBIO_EURO_A_LIBRA)));

}