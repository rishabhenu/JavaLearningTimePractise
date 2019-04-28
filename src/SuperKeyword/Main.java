package SuperKeyword;

public class Main extends Calculate
{  
    public static void main(String[] args)  
    {  
        Calculate obj=new Main();
        
        System.out.println(obj.multiply(12, 13));
   
        
    }

	@Override
	int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
}
