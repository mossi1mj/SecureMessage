//immutable class
public final class SecureMessage {

    private final String message;
    private final String sourceName;
    private final String destName;
    private final String key;


    SecureMessage(String message, String sourceName, String destName, String key){
        this.sourceName = sourceName;
        this.destName = destName;
        this.message = message;
        this.key = key;
    }

    public String getSourceName(){
        return sourceName;
    }

    public String getDestName() {
        return destName;
    }

    public String getMessage(String key) {
        //if statement that verifies key matches stored key
        if(this.key.equals(key)){
            return message;
        }
        else System.out.println("Secret key does not match stored " +
                "key. Message cannot be returned without authentication.");
        return null;
    }


}//end of SecureMessage Class
