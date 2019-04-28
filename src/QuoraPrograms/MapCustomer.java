package QuoraPrograms;

import java.util.HashMap;
import java.util.Map;

//Map a Customer object with key as account No and value as customer object.
public class MapCustomer extends CustomerDetails{

	MapCustomer obj=new MapCustomer();
	
	public static void main(String args[])
	{
		CustomerDetails emp1,emp2,emp3,emp4,emp5;
		emp1=new CustomerDetails("rishabh","sush.rishabhkumar");
		emp2=new CustomerDetails("neha","neha.sharma@brillio.com");
		emp3=new CustomerDetails("anoop sharma","anoopsharma160@gmail.com");
		
		Map<Integer,Object> empdata=new HashMap<>();
		
		empdata.put(021100, emp1);
		empdata.put(55156, emp2);
		empdata.put(22066, emp3);
		
		System.out.print(empdata.get(021100).toString());
	}	
}
