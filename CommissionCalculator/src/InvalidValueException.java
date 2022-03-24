public class InvalidValueException extends Exception{

    String message;

    public InvalidValueException(String errMessage)
    {
        message = errMessage;
    }

    public String getMessage()
    {
        return message;
    }
}
