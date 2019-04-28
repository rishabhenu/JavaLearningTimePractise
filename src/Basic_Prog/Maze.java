package Basic_Prog;

class Maze{
   
  public int powerof(int i){
        
	  	int output=1;
        for(int j=1;j<=i;j++){
            output*=2;
        }
        return output;
    }
    
    public static void main(String args[]){
    	Maze obj=new Maze();
        int output=0;
        for(int i=1;i<=20;i++)
        {
            if(i%2==1) 
                output=i;
            else 
                output = obj.powerof(i/2);
        System.out.print(output+" ");
        if(i%4==0)System.out.println("");
        }
    }
}
