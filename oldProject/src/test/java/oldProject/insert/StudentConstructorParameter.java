package oldProject.insert;

public class StudentConstructorParameter {

	int shiva;
	String raju;
	
	public StudentConstructorParameter() {
		shiva = 4567;
		raju = "hai";
	
	}
	public StudentConstructorParameter(int i) {
		shiva = i;
	}
	public StudentConstructorParameter(int k , String y) {
		shiva = k;
		raju =y;
	}
	void display() {
		System.out.println(shiva);
		System.out.println(raju);
	}
	public static void main(String[] args) {
		StudentConstructorParameter s=new StudentConstructorParameter();
		StudentConstructorParameter s1=new StudentConstructorParameter(56);
		StudentConstructorParameter s2=new StudentConstructorParameter(99,"hello");
		s.display();
		s1.display();
		s2.display();
	}
}
