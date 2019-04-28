package QuoraPrograms;

public class PickEvenGreaterThanN extends PickFirstEvenNo {

	static PickFirstEvenNo obj=new PickFirstEvenNo();
	
	public static void main(String args[])
	{
		int inputno=5;
		int inputarray[]= {7,5,8,3,4,5,6};
		
		int outputno=0;
		boolean outputboolean=false;
		
		int outputarray[]= obj.IncrArray(inputarray);
		
		for(int i:outputarray)
			{System.out.println(i);}
		
		for(int i:outputarray)
		{
			if(obj.isEven(i) && i>inputno)
			{
				outputno=i;
				outputboolean=true;
			break;}
		}
		
		if(outputboolean)System.out.println("even no greater than "+inputno+" is "+outputno);
		else System.out.println("no number is found");
	}
	
}
