package Array;

public class TwoDimentionalArray extends OneDimentionalArray{

int array1[][]= {{5,3},{8,1}};

void SumOf2D() {
	int array2[][]= {{10,11},{3,7}};
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.print( array1[i][j]+array2[i][j] + "	");
		}
			System.out.println(" ");
	}

}

void MulOf2D() {
	int array2[][]= {{5,1},{3,2}};
	int array3[][] = {{0,0},{0,0}};
	int temp1;
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			temp1=0;
			for(int k=0;k<2;k++) {
				
			temp1=temp1+array1[i][k]*array2[k][j];
			
			}
			
			array3[i][j]=temp1;
			
			System.out.print(array3[i][j]+"	");
			
		}
		System.out.println(" ");
	}
		
}

public static void main(String args[]) {
	//new TwoDimentionalArray().SumOf2D();
	new TwoDimentionalArray().MulOf2D();
}
}
