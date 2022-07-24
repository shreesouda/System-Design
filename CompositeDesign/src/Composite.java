import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	
	private String name;
	List<Component> lt = new ArrayList<>();
	
	public Composite(String name) {
		this.name = name;
	}
	
	public void add(Component comp) {
		lt.add(comp);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(name);
		for (Component c : lt)
			c.show();
		
	}
	

}
