import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	
	private String name;
	private List<Book> al = new ArrayList<>();
	
	public BookShop(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAl(List<Book> al) {
		this.al = al;
	}
	
	public List<Book> getAl() {
		// TODO Auto-generated method stub
		return al;
	}

	public void addBook() {
		//actually this has to contact database, retrieve data and based on those data, needs to create Books
		//i.e Book objects. But here for simplicity purpose we are manually creating objects using for loop.
		for (int i = 1; i <= 10; i++) {
			Book b = new Book(i, "Book " + i);
			al.add(b);
		}
	}

	@Override
	public String toString() {
		return "BookShop [name=" + name + ", al=" + al + "]";
	}
	
	protected BookShop Clone() throws CloneNotSupportedException {
		
		//List<Book> al = new ArrayList<>();
		BookShop bs1 = new BookShop("rohitshop");
		//al = this.getAl();
		for (Book b : this.getAl()) {
			Book bk = new Book(420, "ram");
			bk.setId(b.getId());
			bk.setName(b.getName());
			bs1.getAl().add(bk);
		}
		//bs1.setAl(al);
		return bs1;
		
	}

}
