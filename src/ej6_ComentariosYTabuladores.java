void main() {
    /* Coge el programa de la ficha personal y haz estos cambios:
    1. Añade comentarios: nombre del fichero, descripción y autor arriba del todo.
    2. Guarda cada dato en su propia variable antes de imprimirlo.
    3. Usa la secuencia de escape del tabulador para sangrar todas las líneas menos la primera.
    4. Saca el mismo resultado de dos formas: con varios IO.println y con uno solo.
    */

    /*
    Nombre del fichero: ej6_ComentariosYTabuladores
    Descripción: Ficha con información personal de su autor.
    Autor: Miguel Ángel Redondo Raya
    */

    String name = "Miguel Ángel Redondo Raya";
    String address = "C/ Cuatro Esquinas 4";
    String phone = "657 80 73 29";

    // Con un println por línea
    IO.println("FICHA PERSONAL");
    IO.println("\t%-12s%s".formatted("Nombre:",name));
    IO.println("\t%-12s%s".formatted("Dirección:",address));
    IO.println("\t%-12s%s".formatted("Teléfono:",phone));

    IO.println("");

    // Con un solo println
    IO.println("""
            FICHA PERSONAL
            \t%-12s%s
            \t%-12s%s
            \t%-12s%s
            """.formatted("Nombre:",name,"Dirección:",address,"Teléfono:",phone));
}