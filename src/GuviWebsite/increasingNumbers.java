package GuviWebsite;

public class increasingNumbers {
	
	public int smalleroftwo(int a, int b) {
	return (a>b)?b:a;}
	
	public int biggeroftwo(int a,int b) {
		return (a<b)?b:a;
	}
	
	public static void main(String args[]) {
		increasingNumbers obj=new increasingNumbers();
		
//		int arr3[]= {3,8,10,2,50,22,15};
		int arr3[]= {10,5,12,2};
		
		
		//method 1
//		for(int i=0;i<arr3.length;i++) {
//			int temp=0;
//			
//			for(int j=i;j<arr3.length;j++) {
//				
//				temp=arr3[i];
//				
//				arr3[i]=obj.smalleroftwo(arr3[i], arr3[j]);
//				
//				if(arr3[i]==arr3[j])arr3[j]=temp;
//
//			}
			
			//method 2
			for(int i=0;i<arr3.length;i++) {
				for(int j=i;j<arr3.length;j++) {
					int temp=0;

				if(arr3[i]>arr3[j])  {
					
					temp=arr3[i];
					arr3[i]=arr3[j];
					arr3[j]=temp;}
										
					}
			
			for(int k=0;k<arr3.length;k++) {
				System.out.print(arr3[k]+" ");}
			
			System.out.println("");
			
		}
		
		for(int i=0;i<arr3.length;i++) {
		System.out.print(arr3[i]+" ");}
	}

}
