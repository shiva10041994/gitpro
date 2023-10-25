package oldProject.insert;

public class OwnerDetails {
	
	int ownernumber  = 12345;
	String ownername  = "shiva";
	String owneraddress = "kakinada";
	
	void show() {
		
		System.out.println(ownernumber);
		System.out.println(ownername);
		System.out.println(owneraddress);
	}
	public static void main(String[] args) {
		OwnerDetails h = new OwnerDetails();
		h.show();		
	}
}
