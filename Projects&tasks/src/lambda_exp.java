
interface myintern{
	void display(int a);
}
public class lambda_exp {

	public static void main(String[] args) {
		myintern m=(int a)->{
			System.out.println("This is lambda expression  " +a); //interface we can't create object but we can use lamba expression
		};
		m.display(10);     
	}
}
