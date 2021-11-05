package Lab_6_7.Set2.Q3;

public class Main {

    public static void main(String[] args) {

        String str = null;

        try {
            System.out.println(str.equals("hello"));
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Handled Null Pointer Exception");
        }
    }
}
