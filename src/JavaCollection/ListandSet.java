package JavaCollection;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ListandSet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> setofintegerseven=new HashSet<>();
		Set<Integer> setofintegersodd=new HashSet<>();
		
		ArrayList myList=new ArrayList();
		
		
		for(int i=0;i<=10;i+=2) {
			setofintegerseven.add(i);
		}
		myList.add(0, setofintegerseven);
		myList.add(1,setofintegersodd);
		myList.add(2,1);
		myList.add(3,4);
		myList.add(4,5);
		myList.add(5,10);
		myList.add(6,5);
		
		setofintegerseven.add(4);
		
		//System.out.println(myList);
		
		for(int i=1;i<10;i+=2) {
			setofintegersodd.add(i);
		}
		
		
		//System.out.print(setofintegerseven);
		
		
		
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));}
		
	}

}
