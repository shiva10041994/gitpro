package oldProject.insert;

public class HiggestNumber {
	public static void main(String[] args) {
		
		int a = 12;
		int b = 33;
		int c = 66;
		int d = 99;
		int e = 200;
		
		
		if(a>b & a>c & a>d & a>e) {
			System.out.println("a is higgest number is : " +a);
			System.out.println("a is value of " +a);
			
		}
		else if(b>c) {
			System.out.println("b is higgest number is : " +b);
			System.out.println("b is value of " +b);
		}
		else if (d>e) {
			System.out.println("d is higgest number is : " +d);
			System.out.println("d is value of " +d);
		}
		else if(c>d) {
			
			System.out.println("c is higgest number is:" +c);
			System.out.println("c is value of " +c);
		}
		else 
			System.out.println("e is higgest number is :" +e);
			System.out.println("e is value of " +e);
	}

}
