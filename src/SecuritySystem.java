import java.util.ArrayList;
import java.util.Arrays;

public class SecuritySystem {

    private ArrayList<String> messageList = new ArrayList<>();

    private ArrayList<String> userList = new ArrayList<>(Arrays.asList("Max", "James", "Cody", "Mike", "John"));


    public void verifyKey() {
        SecureMessage m1 = new SecureMessage();
        m1.getMessage("Jambieno");
    }

    public void addMessage(String message){
        messageList.add(message);
    } //end of Message Array

    public void printNumberOfUnreadMessages(){
        System.out.println("There is " + messageList.size() + " unread message(s) in your inbox");
    }

    public void printMessageList(){
        for (int i = 0; i < messageList.size(); i++){
            System.out.println((i+1) + ". " + messageList.get(i));
        }
    }

    public void printUsers(){
        for (int i = 0; i < userList.size(); i++) {
            System.out.println((i + 1) + ". " + userList.get(i));
        }
    }

    public String findUser(String searchUser) {
        int position = userList.indexOf(searchUser);
        if (position >= 0) {
            return userList.get(position);
        }
        return null;
    }



}// end of Class
