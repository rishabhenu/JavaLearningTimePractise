package JavaCollection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class listExample {
	
	public static void main(String args[]) {
		
		ArrayList<String> myList=new ArrayList<String>();
			
			myList.add("Hello");
			myList.add("rishabh kumar");
			myList.add("sharma");
			
		Set<Object> myset=new HashSet<>();
		
//			myset.add("this is object in myset Set");
//			myset.add(2);
//			myset.add('.');
			
			int i=new ArrayList<>(myset).indexOf("this is object in myset Set");
			int arr[]=new int[1000];int j=100;
			for(int k=0;k<100;k++) {
				arr[k]=j;
				j--;
				}
	
			
			for(int k:arr) {
			
			myset.add(k);}
			
			
					
//		System.out.println(myList.size());
//		System.out.println(myset);
	
		Set<Integer> set= new LinkedHashSet<>();
		
		Set<Integer> set1=new TreeSet<>();
		
		for(int k=100;k>=0;k--) {
			set.add(k);
		}
		
		System.out.println(set);
		
		set1.addAll(set);
		
		System.out.println(set1);
		
	}
	
	

}
