

public interface my_first_interface {
String state="india";
void first();//{}we can't declare the body beacuase interface and abtract class can't contain the body 
}
class ram implements my_first_interface
{	
	public void first()
	{
		System.out.println("This is ram class");
	}
		
}
class ajay implements my_first_interface
{
	public void first() {
		System.out.println("this is ajay class");
	}
	
}
