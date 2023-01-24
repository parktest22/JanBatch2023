package pkg1;

public class Day3Assignment2 {
	public void m1() {
		System.out.println("1 parameterized method");
	}
	
	public void m2() {
		System.out.println("2 parameterized method");
	}
	
	public void m3() {
		System.out.println("3 parameterized method");
	}
	
	public void m4() {
		System.out.println("4 parameterized method");
		this.m5();
		this.m1();
		this.m2();
		this.m3();
	}
	
	public void m5() {
		System.out.println("Default method");
	}
	
	public static void main(String[] args) {
		Day3Assignment2 obj1 = new Day3Assignment2();
		obj1.m4();
	}
}
