package Lab_6_7.Set2.Q4;

public class myException extends Exception{
    public myException() {
        super("Weight Should be Greater than 100");
    }

    public myException(String message) {
        super(message);
    }
}
