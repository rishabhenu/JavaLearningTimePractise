package GuviWebsite;

public class ArrangeCharactersInDictionary {

	public String[] splitString(String s) {

		String[] temp=new String[s.length()];
	
		temp=s.split("");
		return temp;
	}
	

	public String[] increasingString(String[] s) {
		String temp;
		String result[]=new String[s.length];
		for(int i=0;i<s.length;i++) {
			for(int j=i;j<s.length;j++) {
				if(s[i].compareToIgnoreCase(s[j])>0) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
			result[i]=s[i];
		}	
		return result;
	}
	
	
	public static void main(String args[]) {
		
		ArrangeCharactersInDictionary obj=new ArrangeCharactersInDictionary();
		
		/*arrange characters in increasing order*/
		
//		String string= "neha";
//		String[] str=obj.increasingString(obj.splitString(string));
//		String[] result=obj.increasingString(str);
		
		
		/*arrange words in dictionary order*/
		
		String[] str= {"hello","namste","abhi","to","party","shuru","hui","hai"};
		
		String[] result=obj.increasingString(str);
		
		
		/*printing result*/
		
		for(String s:result) {System.out.println(s);}
		
		
	}
	
}
