package ic;
import java.util.Scanner;

public class QueueTwoStacks {
    public static class MyQueue<T> {
        int size=100;
        int cp=0;
        Integer[] x;
        
        MyQueue(){
        	x = new Integer[size];
        }
        
        public void enqueue(int value) { // Push onto newest stack
            
        	if(cp== size)
        	{
        		int newsize = size*2;
        		Integer[] temp = new Integer[newsize];
        		
        		for(int i =0 ; i <size;i++)
        		{
        			temp[i]= x[i];
        		}
        		x =temp;
        		size = newsize;        		
        	}

        	x[cp]= value;
        	cp++;
        }

        public int peek() {
        	return x[0];
             
        }

        public int dequeue() {
            int de = x[0];
            
            for(int i=0; i < size;i++)
            {
            	if(i== size-1)
            	{
            		x[i] = null;
            		
            	}
            	else
            	{
            		x[i]=x[i+1];
            	}
            	
            }
            cp--;
            return de;
            
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