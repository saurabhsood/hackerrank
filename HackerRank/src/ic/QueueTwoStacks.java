package ic;
import java.util.Scanner;

public class QueueTwoStacks {
    public static class MyQueue<T> {
        
        int[] x = new int[10];
        int[] y = new int[10];

        public void enqueue(T value) { // Push onto newest stack
            
        }

        public T peek() {
             
        }

        public T dequeue() {
            
        }
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}