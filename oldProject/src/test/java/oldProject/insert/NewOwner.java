package oldProject.insert;

public class NewOwner {
	
	int height;
	String name;
	
	void display() {
		System.out.println(height);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		NewOwner n = new NewOwner();
		n.display();
	}
	
}
