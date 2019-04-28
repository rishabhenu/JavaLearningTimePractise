package JavaCollection;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class MapCollection{

	public static void main(String args[]) {
		
		List<Object> list=new ArrayList<>();
		Set<Object> set1=new HashSet();
		
		list.add("abcd");
		list.add(10);
		list.add(21);
		list.add(12); 
		list.add(23);
		list.add(14);
		list.add(14);
		list.add("abc");
		
		
		list.remove(list.indexOf(14));
		
		System.out.println("size of list is "+list.size());
		
		set1.add(2);
		set1.add(3);
	
		System.out.println(list);	
	}
}
