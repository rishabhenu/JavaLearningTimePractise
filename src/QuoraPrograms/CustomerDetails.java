package QuoraPrograms;

public class CustomerDetails {
	private String name;
	private String id;
	
	CustomerDetails(){};

	CustomerDetails(String name, String id)
	{
		this.name="Name : "+name+"\n";
		this.id="Id : "+id+"\n";
	}
	
	public void get()
	{
		System.out.println(name+id);
	}

}
