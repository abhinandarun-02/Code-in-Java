package Lab_3.Stack;

public class Stack {

    private int[] stack = new int[100];
    private int top;

    Stack() {
        top = -1;
    }

    public void insert(int data) {
        if (top != 99) {
            top++;
            stack[top] = data;
            System.out.println(data + " has been inserted successfully");
        } else {
            System.out.println("The Stack is full\nDelete data to insert more!");
        }
    }

    public void displaydeck() {
        if (top == -1) {
            System.out.println("Please insert data!\nNo Data inserted to display.");
        } else {
            System.out.print("Stack Data: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + "  ");
            }
            System.out.println();
        }
    }

    public void peep() {
        if (top == -1) {
            System.out.println("Please insert data!\nNo Data inserted to display.");
        } else {
            System.out.println("Latest Data Inserted: " + stack[top]);
        }
    }

    public void delete() {
        if (top == -1) {
            System.out.println("Error: All Data deleted\nNo more data to delete; Stack is empty");
        } else {
            top--;
            System.out.println("1 Data entry deleted");
        }

    }
}