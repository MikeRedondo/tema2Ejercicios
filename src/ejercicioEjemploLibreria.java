void main() {
    String libro = IO.readln("Nombre del libro: ");
    int identificador = Integer.parseInt(IO.readln("Identificador: "));
    double precio = Double.parseDouble(IO.readln("Precio: "));
    boolean envio = Boolean.parseBoolean(IO.readln("¿Envío gratuito? "));

    IO.println("""
            \n%s #%d
            Precio: %.2f €
            Envío gratuito: %b
            """.formatted(libro, identificador, precio, envio));

    String ficha = """
            ╔═════════════════════════════════════════════╗
            ║               FICHA DEL LIBRO               ║
            ╠═════════════════════════════════════════════╣
            ║  Título : %-33s ║
            ║  ID     : %-33s ║
            ║  Precio : %-33s ║
            ║  Envío  : %-33s ║
            ╚═════════════════════════════════════════════╝
            """.formatted(
            libro,
            identificador,
            "%.2f €".formatted(precio),
            envio ? "Envío gratuito" : "Solo recogida en tienda"
    );

    IO.println(ficha);
}