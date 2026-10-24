void main() {
    // Muestra tu horario de clase de la semana en forma de tabla, con los días como columnas.
    IO.println("%-9S| %-18S| %-18S| %-18S| %-18S| %S".formatted("hora", "lunes", "martes", "miércoles", "jueves", "viernes"));
    IO.println("---------------------------------------------------------------------------------------------------------");
    IO.println("%-9s| %-18s| %-18s| %-18s| %-18s| %s".formatted("08:15", "Bases de Datos", "IPE 1", "Sistemas", "Marcas", "Bases de Datos"));
    IO.println("%-9s| %-18s| %-18s| %-18s| %-18s| %s".formatted("09:15", "Bases de Datos", "Sostenibilidad", "Sistemas", "IPE 1", "Bases de Datos"));
    IO.println("%-9s| %-18s| %-18s| %-18s| %-18s| %s".formatted("10:15", "Entornos", "Digitalización", "Programación", "Programación", "Sistemas"));
    IO.println("%-9s| %-18s| %-18s| %-18s| %-18s| %s".formatted("11:15", "Programación", "Entornos", "Programación", "Programación", "Sistemas"));
    IO.println("%-9s| %-18s| %-18s| %-18s| %-18s| %s".formatted("12:15", "Programación", "Programación", "Entornos", "Bases de Datos", "Sistemas"));
    IO.println("%-9s| %-18s| %-18s| %-18s| %-18s| %s".formatted("13:15", "Marcas", "Programación", "Marcas", "Bases de Datos", "IPE 1"));
}