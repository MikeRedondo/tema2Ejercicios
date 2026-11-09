void main() throws InterruptedException {
    // Pide un número y haz una cuenta atrás desde él, esperando un segundo entre número y número. Al terminar, escribe ¡Tiempo!.
    // Para que el programa espere se usa Thread.sleep(1000), y el main tiene que escribirse así, o no compila:
    // void main() throws InterruptedException {

    // Declaramos variables
    int num;

    // Pedimos datos.
    num = Integer.parseInt(IO.readln("Introduce el número desde el que iniciar la cuenta atrás: "));

    // Iniciamos la cuenta atrás.
    for (int i = num; i > 0 ; i--) {
        IO.println(i);
        Thread.sleep(1000); // Esperamos 1 segundo.
    }
    IO.println("¡Tiempo!");
}