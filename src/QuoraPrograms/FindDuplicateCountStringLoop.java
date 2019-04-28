package QuoraPrograms;

public class FindDuplicateCountStringLoop {
	
	public static void main(String args[])
	{
		String in="rishabh is my is name rishabh rishabh";
		
		String splited[]=in.split(" ");
		
		
//		for(String i:splited)
//		{
//			System.out.println(i);
//		}
		int count=1;
		for(int i=0;i<splited.length;i++) {
			for(int j=i+1;j<splited.length;j++) {
				if(splited[i].equalsIgnoreCase(splited[j]))
				{
		
					count++;
					splited[j]="0";
					
				}
			}
			
			if(count==1)
			{
				System.out.println("first unique word is : "+splited[i]);
				break;
			}
			if(splited[i]!="0"&&!splited[i].equalsIgnoreCase(" "))
				System.out.println(splited[i]+" "+count);
			count=1;
		}
	}

}
