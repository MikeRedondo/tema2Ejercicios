void main() {
    // Pide la base imponible y muestra el IVA (21 %) y el total, con dos decimales.

    final double IVA = 0.21;
    double baseImponible, cuota, totalFactura;

    IO.println("""
            ░█▀▀░█▀█░█░░░█▀▀░█░█░█░░░█▀█░░░▀█▀░█░█░░░█▀▀░█▀█░█▀▀░▀█▀░█░█░█▀▄░█▀█░░░░░░░▀▄░
            ░█░░░█▀█░█░░░█░░░█░█░█░░░█▀█░░░░█░░█░█░░░█▀▀░█▀█░█░░░░█░░█░█░█▀▄░█▀█░░░░▀░░░█░
            ░▀▀▀░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░░▀░░▀▀▀░░░▀░░░▀░▀░▀▀▀░░▀░░▀▀▀░▀░▀░▀░▀░░░░▀░░▀░░
            """);

    baseImponible = Double.parseDouble(IO.readln("Introduce la base imponible: "));
    cuota = baseImponible * IVA;
    totalFactura = baseImponible + cuota;

//    IO.println("El precio base son %.2f€.".formatted(baseImponible));
//    IO.println("La cuota son %.2f€.".formatted(cuota));
//    IO.println("El precio total son %.2f€.".formatted(totalFactura));

    IO.print("""
            
            %-16s%,16.2f €
            %-16s%,16.2f €
            ----------------------------------
            %-16s%,16.2f €
            """.formatted(
                    "Base imponible:", baseImponible, "IVA:", cuota, "Precio total:", totalFactura
    ));
}