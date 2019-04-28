package JavaCollection;
import java.util.*;

import javax.swing.text.TabSet;
import javax.swing.text.TableView.TableCell;

public class IteratorExample {

	public static void main(String[] args) {
		
	Set<String> strset=new LinkedHashSet<>();
		
		strset.add("rishabh");
		strset.add("anoop sharma");
		strset.add("neha");
		strset.add("practise program");
		strset.add("father is ravi dutt");
//		strset.add("neha");
		strset.add("mother is nisafi devi");
//		strset.add("neha");
		
	Collection<Integer> coll=new ArrayList<>();	
		
	Map<Integer,String> map=new Hashtable<>();
		
		map.put(1, "rishu");
		map.put(2, "neha");
		map.put(0, "rishu");
		
		System.out.println("nehaa".equals("Nehaa"));
		
	System.out.println(map);

		System.out.println(strset);
		
		System.out.println(strset);
		
		
	List<String> liststrset=new ArrayList<>();
		
		liststrset.addAll(strset);
		
		liststrset.add("neha");
		
		liststrset.add("neha");
		
		int count=0;
		for(int i=0;i<liststrset.size();i++)
		{
			String temp=liststrset.get(i);
			if(temp.equalsIgnoreCase("neha"))
				count++;
		}
		
		System.out.println("no of times neha is "+count);
		
		
		System.out.println("index of 'neha' is "+liststrset.indexOf("neha"));
		
		for(String s:liststrset) {
			System.out.println(s);
		}
		
	Set<String> list =new TreeSet<>();
		
//		for(String i:strset)
//		{
//			list.add(i);
//		}
		list.addAll(liststrset);
		System.out.println(list);
		
	}

}
