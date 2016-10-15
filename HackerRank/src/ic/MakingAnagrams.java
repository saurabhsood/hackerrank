package ic;

import java.util.Scanner;

public class MakingAnagrams {

	public static void main(String s[])
	{
		 Scanner in = new Scanner(System.in);
	     StringBuilder a = new StringBuilder(in.next());
	     StringBuilder b = new StringBuilder(in.next());
	     
	     char []c = a.toString().toCharArray();
	    
	     for(int i =0; i < c.length ; i++)
	     {
	    	 int index = b.indexOf(c[i]+"");
	    	 if(index != -1)
	    	 {
	    		 b.replace(index, index+1, "");
	    		 index = a.indexOf(c[i]+"");
	    		 a.replace(index, index+1, "");
	    	 }	    	
	     }
	     System.out.println(b.length()+a.length());	     
	}		
}
