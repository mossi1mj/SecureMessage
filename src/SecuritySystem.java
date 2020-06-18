import java.util.ArrayList;

public class SecuritySystem {

    ArrayList<SecureMessage> myUsers;
    ArrayList<SecureMessage> messageList;

    public SecuritySystem(String message){
        SecureMessage user1 = new SecureMessage("","Max", "Max", "Jambieno");
        SecureMessage user2 = new SecureMessage("", "Ksenia", "Ksenia", "Jambieno");
        SecureMessage user3 = new SecureMessage("", "Sally", "Sally", "Jambieno");
        SecureMessage user4 = new SecureMessage("", "Ali", "Ali", "Jambieno");
        SecureMessage user5 = new SecureMessage("", "Tyrone", "Tyrone", "Jambieno");
        this.myUsers = new ArrayList<>();
        this.messageList = new ArrayList<>();
        myUsers.add(user1);
        myUsers.add(user2);
        myUsers.add(user3);
        myUsers.add(user4);
        myUsers.add(user5);
    }

    public static String addMessage(SecureMessage message){
        return message.getMessage("Jambieno");
    }

    public void printUsers(){
        System.out.println("User List: ");
        for (int i = 0; i < myUsers.size(); i++) {
            System.out.println((i + 1) + ". " + myUsers.get(i).getDestName());
        }
    }






}// end of Class
