package Trancxn;

public class PrintBuyandSellDay {
	
	static int input[]= {1,3,5,4,2};
	public static void main(String args[])
	{
		PrintBuyandSellDay obj=new PrintBuyandSellDay();

		int sortedArray[]=obj.sortAsc(input);
		
		for(int i:input) {System.out.print(i+" ");}
		
		System.out.println();
		
		for(int i:sortedArray) {System.out.print(i+" ");}
		System.out.println();
		
		String buy=obj.day(sortedArray[0]);
		
		String sell=obj.day(sortedArray[sortedArray.length-1]);
		
		int profit=sortedArray[sortedArray.length-1]-sortedArray[0];
		
		System.out.println("buy on "+buy+" sell on "+sell+" profit = "+profit);
	}

	private int[] sortAsc(int[] temp) {
		// TODO Auto-generated method stub
//		int input[]=new int[temp.length];
		int index=0;
		
		int[] input=temp.clone();
//		for(int j:temp) {input[index]=j;index++;}
		
		for(int i=0;i<input.length;i++)
		{
			for(int j=i;j<input.length;j++)
			{
				if(input[i]>input[j])
				{
					index=input[i];
					input[i]=input[j];
					input[j]=index;
				}
			}
		}
		return input;
	}

	private String day(int n) {
		// TODO Auto-generated method stub
		String result="Day";
		int no=1;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]==n)
			{
				result+=no+i;
				return result;
			}
		}
		return null;
	}

	
}
