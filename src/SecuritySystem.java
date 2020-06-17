import java.util.ArrayList;

public class SecuritySystem {
    private ArrayList<SecureMessage> myUsers;
    private ArrayList<SecureMessage> messageList;

    public SecuritySystem(String message){
        this.myUsers = new ArrayList<SecureMessage>();
        this.messageList = new ArrayList<SecureMessage>();
    }


    public static void addMessage(SecureMessage message){
        message.getMessage("Jambieno");
    }

    public void addNewUser(SecureMessage user) {
        myUsers.add(user);
    }


    public void printNumberOfUnreadMessages(){
        System.out.println("There is " + messageList.size() + " unread message(s) in your inbox");
    }

    public void printMessageList(){
        for (int i = 0; i < messageList.size(); i++){
            System.out.println((i+1) + ". " + messageList.get(i));
        }
    }

    public void printUsers(){
        System.out.println("User List: ");
        for (int i = 0; i < myUsers.size(); i++) {
            System.out.println((i + 1) + ". " + myUsers.get(i).getDestName());
        }
    }

    private int findUser(SecureMessage user){
        return this.myUsers.indexOf(user);
    }

    public String findUsers(SecureMessage user) {
        if (findUser(user) >= 0){
            return user.getDestName();
        }
        return null;
    }





}// end of Class
