import MainPackage.Deliveries;

public class findRuns {
	
	public static void main(String[] args)
	{
		for(int i=0;;i++)
		{
			try
			{
				if(Deliveries.listdeliveries.get(i).matchid==60)
				{
					System.out.println(Deliveries.listdeliveries.get(i).totalruns);
				}
			}catch(Exception e) {break;}
		}
	}
}
