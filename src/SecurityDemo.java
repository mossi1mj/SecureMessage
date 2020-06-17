import java.util.Scanner;

public class SecurityDemo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        while(!quit){
            Options();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    System.out.println("Thanks for using the Secure Messaging Program. Goodbye!");
                    quit = true;
                    break;
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;
            }//end of switch case
        }//end of while loop
    }//end of main method

    public static void Options() {
        System.out.println("0 - exit program");
        System.out.println("1 - send message");
        System.out.println("2 - view inbox");
        System.out.println("3 - view users");
    }//end of Options method




}//end of class
