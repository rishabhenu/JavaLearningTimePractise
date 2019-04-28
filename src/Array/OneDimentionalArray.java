package Array;


public class OneDimentionalArray {


	int array1[]= {10,20,30,40,50,60};
	

void SumOf1D(){
	
	int array2[]= {2,5,3,1,7,0};
	
	for(int i=0;i<=5;i++) {
		System.out.print(array1[i]+array2[i]+" ");
	}
	System.out.println(" ");
	}
	
int  abs(int i) {
	return(i<=0)?-i:i;
	}

void DifferenceOfArray() {
	
	int array2[]= {13,2,36,5,57,9};
	for(int i=0;i<=5;i++) {
		
		System.out.print(abs(array2[i]-array1[i])+" ");
	}
	System.out.println(" ");
	
	
}
	


public static void main(String args[]) {
	
	OneDimentionalArray obj=new OneDimentionalArray();
	
	obj.SumOf1D();
	obj.DifferenceOfArray();
}
}
