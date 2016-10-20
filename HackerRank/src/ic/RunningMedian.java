package ic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RunningMedian {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        List<Integer> data = new ArrayList<>(); 
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();           
            data .add(a[a_i]);
           Collections.sort(data);
            
           int div = data.size()/2;
            if(data.size()%2 != 0)
            {
            	System.out.println(data.get(Integer.valueOf(div))+0.0);
            }
            else
            {
            	
            	System.out.println(0.0+((data.get(div-1)+data.get(div))/2.0));
            }   
        }        
    }
	
}
