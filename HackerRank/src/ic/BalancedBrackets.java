package ic;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String expression) {
      
    	char [] a = expression.toCharArray();
    	Stack<Character>data = new Stack<>();
    	for(int i =0; i <a.length  ;i++)
    	{    		
    		if(a[i] =='}')
    		{    	
    			if(data.isEmpty())
    			{
    				return false;    			
    			}    			 			
    			else if(data.pop() =='{')
    			{    				
    				continue;
    			}
    			else
    			{
    				return false;
    			}   			
    		}
    		else if(a[i] ==')')
    		{    			
    			if(data.isEmpty())
    			{
    				return false;    			
    			}    			 			
    			else if(data.pop() =='(')
    			{
    				continue;
    			}
    			else
    			{
    				return false;
    			}  
    		}
    		else if(a[i] ==']')
    		{    			
    			if(data.isEmpty())
    			{
    				return false;    			
    			}    			 			
    			else if(data.pop() =='[')
    			{
    				continue;
    			}
    			else
    			{
    				return false;
    			}  
    		}
    		else
    		{
    			data.push(a[i]);    			
    		}
    	}
    	
    	if(data.isEmpty())
    	return true;
    	else
    		return false;
    	
     }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}