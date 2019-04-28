package QuoraPrograms;


public class PickFirstEvenNo {
	
	public static void main(String args[])
	{
		PickFirstEvenNo obj=new PickFirstEvenNo();
		
		int i[]= {7,5,1,3,6,8};
		
		int j[]=obj.IncrArray(i);
		
		boolean result=false;
		int firsteven=0;
		for(int k:j)
		{
			if(obj.isEven(k))
			{
				result=true;
				firsteven=k;
				break;
			} 
		}
		if(result) System.out.println(firsteven);
		else System.out.println("no even no present in the array");
		
	}
	
	public int[] IncrArray(int temp[])
	{
		for(int i=0;i<temp.length;i++)
		{
			int a=0;
			for(int j=i;j<temp.length;j++)
			{
				if(temp[i]>=temp[j])
				{
					a=temp[j];
					temp[j]=temp[i];
					temp[i]=a;
				}
			}
		}
		return temp;
	}

	public boolean isEven(int i)
	{
		if (i%2==0) return true;
		return false;
	}
}
