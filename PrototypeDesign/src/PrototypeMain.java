
public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bs = new BookShop("shreeshop");
		bs.addBook();
		
		System.out.println(bs);
		
		//BookShop bs1 = new BookShop("rohitshop");
		//bs1.addBook();
		BookShop bs1 = bs.Clone();
		//bs1.setName("rohitshop");
		System.out.println(bs1);
		
		//bs1.getAl().remove(0);
		
		Book b = bs1.getAl().get(0);
		b.setName("name");
		
		System.out.println(bs);
		System.out.println(bs1);
	}

}
