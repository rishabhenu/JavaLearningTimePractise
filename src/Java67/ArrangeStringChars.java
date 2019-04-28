package Java67;

public class ArrangeStringChars {
	
	public static void main(String args[])
	{
		System.out.println(checkAnagram("bccaa","aabcc"));
	}
	
	public static String arrangedChars(String s)
	{
		char[] toChar=s.toLowerCase().toCharArray();
		char temp;String result="";
		for(int i=0;i<toChar.length;i++)
		{
			for(int j=i;j<toChar.length;j++)
			{
				if(toChar[i]>toChar[j])
				{
					temp=toChar[i];
					toChar[i]=toChar[j];
					toChar[j]=temp;
				}
			}
			result+=toChar[i];
		}
		return result;
	}
	
	public static boolean checkAnagram(String s1,String s2)
	{
		return (arrangedChars(s1).equals(arrangedChars(s2)));
	}

}
