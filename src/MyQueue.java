import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyQueue
{
    public static void main(String[] args)
    {
        Queue<String> queue;

        //Add elements
        Scanner keyboard = new Scanner(System.in);
        queue = new LinkedList<>();
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter a String: ");
            queue.offer(keyboard.next());
        }
        //Prints the queue, size, first and last element and removes an element from the queue
        System.out.println();
        System.out.println("First version:");
        System.out.println("\tFirst element in the queue: " + queue.peek());
        System.out.println("\tSize of the queue: " + queue.size());
        System.out.println("\tElements in the queue: " + queue);
        System.out.println("\tRemoving element from the queue: " + queue.remove());


        //Prints the updated queue, size, first and last element
        System.out.println();
        System.out.println("Updated version:");
        System.out.println("\tFirst element in the queue: " + queue.peek());
        System.out.println("\tSize of the queue: " + queue.size());
        System.out.println("\tElements in the queue: " + queue);

        //Clears the queue
        queue.clear();

        //Prints the final cleared queue, size, first and last element
        System.out.println();
        System.out.println("Final version:");
        System.out.println("\tFirst element in the queue: " + queue.peek());
        System.out.println("\tSize of the queue: " + queue.size());
        System.out.println("\tElements in the queue: " + queue);
    }
}
