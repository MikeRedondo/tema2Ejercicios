void main() {
    // Declara una variable para cada dato, con el tipo más pequeño que pueda representarlo, y justifica la elección.

    // Si un empleado está casado o no.
    boolean casado; // Solo puede ser verdadero o falso.

    // Un valor máximo que no se puede modificar: 999999.
    final int MAX; // Número entero, variable en mayúsculas porque es una constante.

    // Día de la semana.
    byte diaSemana; // Número entero de 1 a 7

    // Día del año.
    short diaAnio; // Número entero de 1 a 366, transformamos la "ñ" en "ni"

    // Sexo, con dos valores posibles: 'V' o 'M'.
    char sexo; // Un único caracter.

    // Milisegundos transcurridos desde el 01/01/1970.
    long milisegundos; // Número entero muy grande.

    // El total de una factura.
    BigDecimal totalFactura; // Para dinero, usar "double" puede dar errores con los decimales.

    // La población mundial.
    long poblacionMundial; // Número entero muy grande.
}