//immutable class
public final class SecureMessage {

    private final String message;
    private final String sourceName;
    private final String destName;
    private final String key;

    SecureMessage(){
        this.message = "";
        this.sourceName = "";
        this.destName = "";
        this.key = "";
    }

    SecureMessage(String message, String sourceName, String destName, String key){
        this.message = message;
        this.sourceName = sourceName;
        this.destName = destName;
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
        return message;
    }

}//end of SecureMessage Class
