package Lab_3.Queue;

public class Queue {
    private int[] queue = new int[100];
    private int front, rear;

    Queue() {
        front = -1;
        rear = -1;
    }

    public void register(int data) {
        if (front == -1 && rear == -1) {
            rear++;
            front++;
            queue[rear] = data;
            System.out.println(data + " has been added successfully");
        } else if (rear != 99) {
            rear++;
            queue[rear] = data;
            System.out.println(data + " has been added successfully");
        } else {
            System.out.println("The Queue is full\nDelete data to insert more!");
        }
    }

    public void displayqueue() {
        if (front == -1 && rear == -1) {
            System.out.println("Please insert data!\nNo Data inserted to display.");
        } else {
            System.out.print("Queue Data: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + "  ");
            }
            System.out.println();
        }
    }

    public void whonext() {
        if (front == -1 && rear == -1) {
            System.out.println("Please insert data!\nNo Data inserted to display.");
        } else {
            System.out.println("Next Car in Queue: " + queue[front]);
        }
    }

    public void delete() {
        if (front == -1 && rear == -1) {
            System.out.println("Error: All Data deleted\nNo more data to delete; Queue is empty");
        } else if (front == rear) {
            front = rear = -1;
            System.out.println("1 Car removed from queue");
        } else {
            front++;
            System.out.println("1 Car removed from queue");
        }
    }
}
