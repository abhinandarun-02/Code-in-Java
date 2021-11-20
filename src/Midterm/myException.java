package Midterm;

public class myException extends Exception{
    public myException() {
        super("Your name contains even number of vowels.");
    }

    public myException(String message) {
        super(message);
    }
}