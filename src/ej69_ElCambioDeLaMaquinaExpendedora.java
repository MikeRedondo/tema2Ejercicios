void main() {
    // Pide el precio del producto y el dinero que mete el usuario, y calcula el cambio indicando cuántas monedas de cada tipo devuelve la máquina. Tiene monedas de 2 €, 1 €, 50, 20, 10 y 5 céntimos, y los precios van de 5 en 5 céntimos. Da siempre el menor número de monedas posible.

    // Precio (€): 1.35
    // Dinero que metes (€): 5
    // Cambio: 3,65 €
    // 1 de 2 €
    // 1 de 1 €
    // 1 de 50 céntimos
    // 1 de 10 céntimos
    // 1 de 5 céntimos

    //Si el dinero no llega, di cuánto falta. Si es justo, di que no hay cambio.

    // Declaramos variables.
    double precio, dineroIntroducido;
    int cambio, monedas;

    // Pedimos datos.
    precio = Double.parseDouble(IO.readln("Precio (€): "));
    dineroIntroducido = Double.parseDouble(IO.readln("Dinero que metes (€): "));

    // Si el dinero no llega.
    if (dineroIntroducido < precio) IO.println("Faltan %.2f €.".formatted(precio - dineroIntroducido));

    // Si el dinero es justo.
    if (dineroIntroducido == precio) IO.println("Dinero justo, no hay cambio.");

    // Si hay que devolver cambio.
    if (dineroIntroducido > precio) {
        cambio = (int) Math.round(dineroIntroducido * 100) - (int) Math.round(precio * 100); // Calculamos el cambio pasándolo a céntimos para evitar los descuadres de decimales que provocan los double.
        IO.println("Cambio: %.2f €".formatted(cambio / 100.0));

        monedas = cambio / 200;
        cambio %= 200;
        if (monedas > 0) IO.println(monedas + " de 2 €");

        monedas = cambio / 100;
        cambio %= 100;
        if (monedas > 0) IO.println(monedas + " de 1 €");

        monedas = cambio / 50;
        cambio %= 50;
        if (monedas > 0) IO.println(monedas + " de 50 céntimos");

        monedas = cambio / 20;
        cambio %= 20;
        if (monedas > 0) IO.println(monedas + " de 20 céntimos");

        monedas = cambio / 10;
        cambio %= 10;
        if (monedas > 0) IO.println(monedas + " de 10 céntimos");

        monedas = cambio / 5;
        if (monedas > 0) IO.println(monedas + " de 5 céntimos");
    }
}