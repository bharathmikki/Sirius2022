package sample;
		
 class Example {
	
	 int add = 30;
	public String name = "Bharath";
	private int num = 100;
	protected int number = 200;
	
	int addTwoNumbers(int a,int b) {
		return a+b;
	}
	private int square(int x) {
		return x*x;
	}
	protected int subTwoNumbers(int p,int q) {
		return p-q;
	}
	public int multiply(int a, int b) {
		return a*b;		
	}
		
}
public class ClassBasics{
	
	public static void main(String[] args) {
			
		Example obj = new Example();
		
		System.out.println(obj.add);
		
		System.out.println(obj.name);
		
		System.out.println(obj.num);
	
		System.out.println(obj.number);
		
		System.out.println(obj.addTwoNumbers(10, 20));
		
		System.out.println(obj.square(5));
		
		System.out.println(obj.subTwoNumbers(10, 5));
		
		System.out.println(obj.multiply(10, 3));
	}
			
}		
		