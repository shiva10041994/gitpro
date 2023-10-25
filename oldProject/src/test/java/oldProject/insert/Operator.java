package oldProject.insert;

public class Operator {
	public static void main(String[] args) {
		
		//arithmetic  operation
		
		int x = 40;
		int y = 50;
		int z = x+y;
		System.out.println("the sum of x and y is:" +z);
		System.out.println("the sum of x or y is:" +(x-y));
		System.out.println("the sum of x multi y is:" +(x*y));
		System.out.println("the sum of x div y is:" +(y/x));
		
		//relational operation
		System.out.println("x is greater than y is =" +(x>y));
		System.out.println("y is greater than x is =" +(x<y));
		System.out.println("x is greater than y is =" +(x>=y));
		System.out.println("y is greater than x is =" +(x<=y));
		System.out.println("x is eqaul than y is =" +(x!=y));
		
		//increment or decrement
		
		x=56;
		x++;
		System.out.println(x);
		
		y=60;
		y--;
		System.out.println(y);
		
		
	}

}
