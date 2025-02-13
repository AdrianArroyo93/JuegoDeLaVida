package JuegosMarcianitos; // Define el paquete en el que se encuentra la clase

import java.util.Random; // Importa la clase Random para generar números aleatorios
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class JuegosMarcianitos { // Declara la clase JuegosMarcianitos
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        Random random = new Random(); // Crea un objeto Random para generar números aleatorios
        
        // Muestra el menú al usuario
        System.out.println("Elige el modo de juego:");
        System.out.println("Basico");
        System.out.println("Aleatorio");
        System.out.println("Personalizado");
        System.out.println("Avanzado");
        
        String eleccion = scanner.nextLine(); // Lee la elección del usuario y la almacena en la variable eleccion
        
        // Inicializar variables de celdas
        int celda1 = 0, celda2 = 0, celda3 = 0, celda4 = 0, celda5 = 0, celda6 = 0, celda7 = 0, celda8 = 0, celda9 = 0, celda10 = 0;
        boolean modoAvanzado = false; // Inicializa el modo avanzado a falso
        int numTurnos = 10; // Número de turnos predeterminado
        
        // Inicializar fila de células según el modo elegido
        if (eleccion.equalsIgnoreCase("aleatorio")) { // Si el modo elegido es aleatorio
            // Asigna un valor aleatorio (0 o 1) a cada celda
            celda1 = random.nextInt(2);
            celda2 = random.nextInt(2);
            celda3 = random.nextInt(2);
            celda4 = random.nextInt(2);
            celda5 = random.nextInt(2);
            celda6 = random.nextInt(2);
            celda7 = random.nextInt(2);
            celda8 = random.nextInt(2);
            celda9 = random.nextInt(2);
            celda10 = random.nextInt(2);
        } else if (eleccion.equalsIgnoreCase("basico") || eleccion.equalsIgnoreCase("personalizado") || eleccion.equalsIgnoreCase("avanzado")) { // Si el modo elegido es básico, personalizado o avanzado
            // Solicita al usuario que introduzca los valores para cada celda
            System.out.print("Introduce el valor (0 ó 1) para la celda 1: ");
            celda1 = scanner.nextInt();
            System.out.print("Introduce el valor (0 ó 1) para la celda 2: ");
            celda2 = scanner.nextInt();
            System.out.print("Introduce el valor (0 ó 1) para la celda 3: ");
            celda3 = scanner.nextInt();
            System.out.print("Introduce el valor (0 ó 1) para la celda 4: ");
            celda4 = scanner.nextInt();
            System.out.print("Introduce el valor (0 ó 1) para la celda 5: ");
            celda5 = scanner.nextInt();
            System.out.print("Introduce el valor (0 ó 1) para la celda 6: ");
            celda6 = scanner.nextInt();
            System.out.print("Introduce el valor (0 ó 1) para la celda 7: ");
            celda7 = scanner.nextInt();
            System.out.print("Introduce el valor (0 ó 1) para la celda 8: ");
            celda8 = scanner.nextInt();
            System.out.print("Introduce el valor (0 ó 1) para la celda 9: ");
            celda9 = scanner.nextInt();
            System.out.print("Introduce el valor (0 ó 1) para la celda 10: ");
            celda10 = scanner.nextInt();
        }
        
        // Si el modo elegido es personalizado o avanzado
        if (eleccion.equalsIgnoreCase("personalizado") || eleccion.equalsIgnoreCase("avanzado")) {
            System.out.print("¿Cuántas rondas quieres jugar? (max 10): "); // Solicita al usuario que introduzca el número de rondas
            numTurnos = scanner.nextInt();
        }
        
        // Si el modo elegido es avanzado
        if (eleccion.equalsIgnoreCase("avanzado")) {
            modoAvanzado = true; // Activa el modo avanzado
        }

        // Ejecutar el juego
        for (int turno = 1; turno <= numTurnos; turno++) { // Bucle que se ejecuta numTurnos veces
            System.out.print("Turno " + turno + ": "); // Imprime el número de turno
            // Imprime el estado actual de las celdas
            System.out.println(celda1 + " " + celda2 + " " + celda3 + " " + celda4 + " " + celda5 + " " + celda6 + " " + celda7 + " " + celda8 + " " + celda9 + " " + celda10);
            
            // Calcular el siguiente turno con la regla avanzada si el modo es avanzado
            int nuevaCelda1 = modoAvanzado ? (celda10 + celda2) : celda2;
            nuevaCelda1 = nuevaCelda1 == 1 ? 1 : 0;
            int nuevaCelda2 = (celda1 + celda3) == 1 ? 1 : 0;
            int nuevaCelda3 = (celda2 + celda4) == 1 ? 1 : 0;
            int nuevaCelda4 = (celda3 + celda5) == 1 ? 1 : 0;
            int nuevaCelda5 = (celda4 + celda6) == 1 ? 1 : 0;
            int nuevaCelda6 = (celda5 + celda7) == 1 ? 1 : 0;
            int nuevaCelda7 = (celda6 + celda8) == 1 ? 1 : 0;
            int nuevaCelda8 = (celda7 + celda9) == 1 ? 1 : 0;
            int nuevaCelda9 = (celda8 + celda10) == 1 ? 1 : 0;
            int nuevaCelda10 = modoAvanzado ? (celda9 + celda1) : celda9;
            nuevaCelda10 = nuevaCelda10 == 1 ? 1 : 0;

            // Actualizar celdas con los nuevos valores calculados
            celda1 = nuevaCelda1;
            celda2 = nuevaCelda2;
            celda3 = nuevaCelda3;
            celda4 = nuevaCelda4;
            celda5 = nuevaCelda5;
            celda6 = nuevaCelda6;
            celda7 = nuevaCelda7;
            celda8 = nuevaCelda8;
            celda9 = nuevaCelda9;
            celda10 = nuevaCelda10;
        }

        // Mostrar el estado final de las celdas
        System.out.println("Estado final:");
        System.out.println(celda1 + " " + celda2 + " " + celda3 + " " + celda4 + " " + celda5 + " " + celda6 + " " + celda7 + " " + celda8 + " " + celda9 + " " + celda10);
    }
}
