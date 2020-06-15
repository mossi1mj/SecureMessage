import java.util.Scanner;

public class SecurityDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static SecuritySystem messageList = new SecuritySystem();
    private static SecuritySystem userList = new SecuritySystem();


    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        while(!quit){
            Options();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    System.out.println("Thanks for using the Secure Messaging Program. Goodbye!");
                    quit = true;
                    break;
                case 1:
                    searchForUser();
                    addMessage();
                    break;
                case 2:
                    messageList.printNumberOfUnreadMessages();
                    messageList.printMessageList();
                    break;

                case 3:
                    System.out.println("User List:");
                    userList.printUsers();
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

    public static void addMessage() {
        System.out.println("Type the message you want to send: ");
        messageList.addMessage(scanner.nextLine());
    }

    public static void searchForUser(){
        System.out.println("Who do you want to send a message to?: ");
        userList.printUsers();
        String searchUser = scanner.nextLine();
        if (userList.findUser(searchUser) != null) {
            System.out.println(searchUser + "is not in the contact list");
        } else {
            System.out.println("Message will be sent to " + searchUser);
        }
    }

}//end of class
