package pkg1;

public class Day2Assignment2 {
	
	public int div(int a, int b) {
		int c = a/b;
		System.out.println("Division of "+a+"/"+b+" is : "+c);
		return c;
	}
	
	public int sub(int d, int e) {
		int f = d-e;
		System.out.println("Subtraction of "+d+" - "+e+" is :"+f);
		return f;
	}
	
	public int sum(int g, int h) {
		int i = g+h;
		System.out.println("Sum of "+g+" + "+h+" is: "+i);
		return i;
	}
	
	public void mult(int j, int k) {
		int l = j*k;
		System.out.println("multiplication of "+j+" * "+k+" is: "+l);
	}
	
	public static void main(String[] args) {
		// (((((10/2)-2)+2)-2)*2)
		Day2Assignment2 day2 = new Day2Assignment2();
		int s1 = day2.div(10, 2);
		int s2 = day2.sub(s1, 2);		
		int s3 = day2.sum(s2, 2);		
		int s4 = day2.sub(s3, 2);		
		day2.mult(s4, 2);
	}
}
