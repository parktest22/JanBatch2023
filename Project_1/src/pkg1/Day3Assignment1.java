package pkg1;

public class Day3Assignment1 {
	public Day3Assignment1(int a, int b, int c) {
		System.out.println("3 parameterized constructor");
	}
	
	public Day3Assignment1() {
		System.out.println("Default parameterized constructor");
	}
	
	public Day3Assignment1(int d){
		System.out.println("1 parameterized constructor");
	}
	
	public Day3Assignment1(int e,int f,int g, int i) {
		this(100);
		System.out.println("4 parameterized constructor");
	}
	
	public Day3Assignment1(int j, int k) {
		this(60, 70, 80, 90);
		System.out.println("2 parameterized constructor");
	}
	
	public static void main(String[] args) {
		Day3Assignment1 obj1 = new Day3Assignment1(10, 20, 30);
		Day3Assignment1 obj2 = new Day3Assignment1();
		Day3Assignment1 obj3 = new Day3Assignment1(40, 50);
		
	}

}
