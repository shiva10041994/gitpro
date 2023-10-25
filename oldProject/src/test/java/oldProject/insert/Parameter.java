package oldProject.insert;

public class Parameter {
	int parameterid;
	String parametername;
	public Parameter() {
		parameterid =34;
		parametername = "hello";
	}
	public Parameter(int x , String y) {
		parameterid =x;
		parametername = y;
		
	}
	void display() {
		System.out.println(parameterid);
		System.out.println(parametername);
		
	}
	
	public static void main(String[] args) {
		Parameter p = new Parameter();
		p.display();
		Parameter p1 = new Parameter(44,"hejjj");
		p1.display();
	}

}
