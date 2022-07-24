
public class AdapterMain {
	
	public static void main(String []a) {
		Drive d = new Drive();
		//Someclass sc = new Someclass();
		Adapter ap = new Adapter();
		d.setC(ap);
		d.drive();
	}

}
