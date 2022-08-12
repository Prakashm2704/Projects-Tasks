
abstract class f{
	 String name ="java";
	abstract void dislay(); 
	int add() {
		System.out.println("this add method");
		int a=10,b=20;
		return a+b;
	}
}
class d extends f
{
	void dislay() {
    System.out.println("this is display method");		
	}
}
class e extends d{
	void print () {
		System.out.println("this is print method");
	}
}
public class abstract_class {
	public static void main(String[] args) {
		e s = new e();
		s.add();
		s.dislay();
		s.print();
		System.out.println("before change "+s.name);
		s.name ="python";
		System.out.println("after change "+s.name);

	}
}
