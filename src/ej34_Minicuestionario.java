void main() {
    // Monta un cuestionario de 5 preguntas tipo test sobre lo que llevamos de módulo. Cada acierto suma un punto y al final se muestra la nota. Pásaselo a un compañero.

    // Inicializamos variables.
    int nota = 0;
    char respuesta = 'z';

    // Mostramos la primera pregunta y pedimos la respuesta.
    respuesta = IO.readln("""
    ¿Cómo se escriben las constantes en java?
    a) En minúsculas
    b) La primera letra en mayúscula
    c) En mayúsculas
    """).charAt(0);
    respuesta = Character.toLowerCase(respuesta);

    // Comprobamos la respuesta a la primera pregunta y sumamos 1 a la nota si es correcta.
    if (respuesta == 'c') {
        IO.println("¡Respuesta correcta! :)\n");
        nota ++;
    } else {
        IO.println("Respuesta incorrecta :(\n");
    }

    // Mostramos la segunda pregunta y pedimos la respuesta.
    respuesta = IO.readln("""
    ¿Qué tipo de dato guarda una variable char?
    a) Primitivo
    b) Referenciado
    c) Paralelo
    """).charAt(0);
    respuesta = Character.toLowerCase(respuesta);

    // Comprobamos la respuesta a la segunda pregunta y sumamos 1 a la nota si es correcta.
    if (respuesta == 'a') {
        IO.println("¡Respuesta correcta! :)\n");
        nota ++;
    } else {
        IO.println("Respuesta incorrecta :(\n");
    }

    // Mostramos la tercera pregunta y pedimos la respuesta.
    respuesta = IO.readln("""
    ¿Qué devuelve el siguiente cálculo en java? 7 / 2
    a) 3.5
    b) 3
    c) 4
    """).charAt(0);
    respuesta = Character.toLowerCase(respuesta);

    // Comprobamos la respuesta a la tercera pregunta y sumamos 1 a la nota si es correcta.
    if (respuesta == 'b') {
        IO.println("¡Respuesta correcta! :)\n");
        nota ++;
    } else {
        IO.println("Respuesta incorrecta :(\n");
    }

    // Mostramos la cuarta pregunta y pedimos la respuesta.
    respuesta = IO.readln("""
    ¿Cuál de los siguientes NO es un operador lógico en java?
    a) &&
    b) ||
    c) %%
    """).charAt(0);
    respuesta = Character.toLowerCase(respuesta);

    // Comprobamos la respuesta a la cuarta pregunta y sumamos 1 a la nota si es correcta.
    if (respuesta == 'c') {
        IO.println("¡Respuesta correcta! :)\n");
        nota ++;
    } else {
        IO.println("Respuesta incorrecta :(\n");
    }

    // Mostramos la quinta pregunta y pedimos la respuesta.
    respuesta = IO.readln("""
    ¿La conversión implícita en java conlleva pérdida de información?
    a) Nunca
    b) A veces
    c) Siempre
    """).charAt(0);
    respuesta = Character.toLowerCase(respuesta);

    // Comprobamos la respuesta a la quinta pregunta y sumamos 1 a la nota si es correcta.
    if (respuesta == 'a') {
        IO.println("¡Respuesta correcta! :)\n");
        nota ++;
    } else {
        IO.println("Respuesta incorrecta :(\n");
    }

    // Mostramos la nota final.
    if (nota > 2) {
        IO.println("Tu nota final es de %d puntos sobre 5. ¡Enhorabuena, has aprobado! :D".formatted(nota));
    } else {
        IO.println("Tu nota final es de %d puntos sobre 5. Nos vemos en la recuperación D:".formatted(nota));
    }
}