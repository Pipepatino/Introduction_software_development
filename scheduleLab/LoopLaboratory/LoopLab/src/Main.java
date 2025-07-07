import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int option;

        // Bucle principal para mostrar el menú hasta que el usuario elija salir
        do {
            System.out.println("\n====== LOOP PRACTICE LAB ======");
            System.out.println("1. Show numbers 1 to 10 with their squares (for loop)");
            System.out.println("2. Countdown from a number (while loop)");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            option = keyboard.nextInt(); // Leer la opción del usuario

            switch (option) {
                case 1:
                    // FOR loop: mostrar números del 1 al 10 con su cuadrado
                    System.out.println("\n--- Numbers and their squares ---");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("Number: " + i + " | Square: " + (i * i));
                    }
                    break;

                case 2:
                    // WHILE loop: cuenta regresiva desde un número ingresado
                    System.out.print("\nEnter a number to count down from: ");
                    int start = keyboard.nextInt();

                    if (start < 1) {
                        System.out.println("Please enter a number greater than 0.");
                    } else {
                        System.out.println("\n--- Countdown ---");
                        while (start >= 0) {
                            System.out.println(start);
                            start--;
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nExiting program... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please enter 1, 2, or 3.");
            }

        } while (option != 3); // Repetir hasta que el usuario elija salir

        keyboard.close(); // Cerrar el scanner
    }
}
