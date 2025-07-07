import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // Initialize variables
        int dayOfTheWeek = 1;
        int breakfastYesOrNot = 1;

        // Display menu for day selection
        System.out.println(
                "********** MENU **********\n" +
                        "These are the choices for the days of the week.\n" +
                        "Please enter only values from 1-7:\n\n" +
                        "1. MONDAY\n" +
                        "2. TUESDAY\n" +
                        "3. WEDNESDAY\n" +
                        "4. THURSDAY\n" +
                        "5. FRIDAY\n" +
                        "6. SATURDAY\n" +
                        "7. SUNDAY\n" +
                        "***************************"
        );

        // Prompt user to enter a day
        System.out.print("What day is today? ");
        dayOfTheWeek = keyboard.nextInt();

        // Validate day input
        if (dayOfTheWeek >= 1 && dayOfTheWeek <= 7) {

            // Ask about breakfast
            System.out.println("Did you have breakfast? \n" +
                    "1. Yes.\n" +
                    "2. No.");
            breakfastYesOrNot = keyboard.nextInt();

            // Respond based on day of the week
            switch (dayOfTheWeek) {
                case 1:
                    System.out.println("Monday: Back to work! Let's start the week strong 💪");
                    break;
                case 2:
                    System.out.println("Tuesday: Keep the momentum going! 🚀");
                    break;
                case 3:
                    System.out.println("Wednesday: Halfway there. Happy Hump Day! 🐫");
                    break;
                case 4:
                    System.out.println("Thursday: Almost the weekend. Stay focused! 🎯");
                    break;
                case 5:
                    System.out.println("Friday: Great job! Finish strong and enjoy the weekend 🎉");
                    break;
                case 6:
                    System.out.println("Saturday: Time to relax or catch up on hobbies 🧘‍♂️🎨");
                    break;
                case 7:
                    System.out.println("Sunday: Recharge for the week ahead ☀️📖");
                    break;
            }

            // Respond based on breakfast input
            if (breakfastYesOrNot == 1) {
                System.out.println("Awesome! You're starting the day with energy 🍳");
            } else if (breakfastYesOrNot == 2) {
                System.out.println("Don’t forget to eat something to fuel your day! 🥪");
            } else {
                System.out.println("Invalid breakfast choice. Please enter 1 or 2.");
            }

        } else {
            // Invalid day input
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        // Close the scanner
        keyboard.close();

        // Adicionando comentarios
    }
}
