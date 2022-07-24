import java.util.Scanner;

import com.fact.FactoryManufacturer;
import com.fact.OS;

public class FactoryMain {

	//like client side application where we'll request for the required object.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter required functionality to get the OS object");
		String str = sc.next();
		FactoryManufacturer fm = new FactoryManufacturer();
		OS obj = fm.getInstance(str);
		obj.specification();

	}

}
