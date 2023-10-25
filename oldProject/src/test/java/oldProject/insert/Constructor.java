package oldProject.insert;

public class Constructor {
	
	
	public Constructor() {
		System.out.println("Constructorname");
	}
	public Constructor(int y) {
		int Constructorid =y;
		System.out.println(Constructorid);
	}
	public Constructor(int x, String z) {
		int Constructorid = x;
		 String Constructorname =z;
		System.out.println(Constructorid);
		System.out.println(Constructorname);
	}
	
	public static void main(String[] args) {
		Constructor cy  =new Constructor();
		Constructor cr =new Constructor(55);
		Constructor ce =new Constructor(99,"shiva");
		
	}

}
