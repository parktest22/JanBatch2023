package pkg1;

public class Day2Assignment1 {
	
	public int sum(int a, int b) {
		int c= a+b;
		System.out.println("Sum of "+a+" + "+b+" is :"+c);
		return c;
	}
	
	public int subtract(int d, int e) {
		int f= d-e;
		System.out.println("Subtraction from "+d+" - "+e+" is :"+f);
		return f;
	}
	
	public int multi(int g, int h) {
		int i = g*h;
		System.out.println("multiplication of "+g+" * "+h+" is :"+i);
		return i; 
	}
	
	public void div(int j, int k) {
		int l = j/k;
		System.out.println("Division of "+j+" / "+k+" is :"+l);
	}
	
	public static void main(String[] args) {
		//(((((10+2)+2)-2)*2)/2)
		Day2Assignment1 day2 = new Day2Assignment1();
		int p = day2.sum(10, 2);
		int q = day2.sum(p,2);		
		int r = day2.subtract(q, 2);		
		int s = day2.multi(r, 2);		
		day2.div(s, 2);	
	}
}
