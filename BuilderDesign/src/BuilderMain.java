
public class BuilderMain {

	
//advantage or why its undertaken is using traditional method of design, its necessary to give all the 
//parameters even though some are'nt required and also it requires us to know the sequence of those 
//parameters. But by this you can specify only those parameters which you need and in any order you want.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Phone p = new Phone("Android", 3000, 15, 5.5, "intel");
		Phone p = new PhoneBuilder().setOs("ios").setProcessor("qualcomm").setBattery(4000).getPhone();
		System.out.println(p);

	}

}
