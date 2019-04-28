package QuoraPrograms;

public class CapitalizeFirstLetter {

	public static void main(String args[])
	{
		CapitalizeFirstLetter obj=new CapitalizeFirstLetter();
		String input="rishabh Kumar Sharma";
		System.out.println(obj.converFirstToUpper(input));
	}
	
	
	public String converFirstToUpper(String s)

	{
		char[] temp=s.toCharArray();
		String upper=(""+temp[0]).toUpperCase();
		
		for(int i=1;i<temp.length;i++)
		{
			upper+=temp[i];
		}
		return upper;
	}
}
