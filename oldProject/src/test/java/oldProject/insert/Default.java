package oldProject.insert;

public class Default {
	
	int Defaultid ;
	String Defaultname ;
	
	void show() {
		System.out.println(Defaultname);
		System.out.println(Defaultid);
	}
	public static void main(String[] args) {
		Default d = new Default();
		d.Defaultid = 6767;
		d.Defaultname = "raju";
		d.show();
	}

}
