package JavaCollection;

import java.util.ArrayList;
import java.util.Collection;

public class P1SimpleCollection {
	
	public static void main(String args[]) {
		
		Collection<Integer> values=new ArrayList<>();
		
		System.out.println("if collection is empty:	"+values.isEmpty());
		
		values.add(34);
		
		for(int i=1;i<105;i+=11)
		{
			values.add(i);
				}
		
		System.out.print(values+"	");
		
		System.out.print("\n");
		
		
		for(int i:values) {
			
			if((int)i%2==0)System.out.print((int)i+" ");else System.out.print(((int)i+1)+" ");
			
		}
	}

}
