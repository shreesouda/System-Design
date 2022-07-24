
public class Leaf implements Component {
	
	private int price;
	private String name;
	
	public Leaf(int price, String name) {
		this.price = price;
		this.name = name;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(name + " : " + price);
		
	}

}
