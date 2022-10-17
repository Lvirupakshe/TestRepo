
public class Test {
	
	
	static 
	{
	System.out.println("Static braces");
	System.out.println("Laxman")	
	}
	
public static class Test1{
	
	Test1(){System.out.println("Constructor");};
	public void display() {System.out.println("Parent Display");}
}

public static class Test2 extends Test1{
	Test2(){
		super();
	};
	public void display() {
		
		System.out.println("Child Display");
		super.display();}
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Test2 t= new Test2();
	t.display();
}

}
