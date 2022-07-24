
public class CompositeMain {
	
	//3 points to keep in mind. classes have objects of another class within them. i.e like HAS-A relationship.
	//usually contained in a list. these are composite where as there can be leaf objects which don't have 
	//in turn objects in them. Composite in turn might have either of these. thing is how they are related?
	//leaf and the composite must implement a common interface so that they'll be related. Also, operations
	//that you do on leafs should also be allowed for composites. i.e you should be able to track a value 
	//or calculate a value of the composite using its leafs values. Like how we showed the prices of the 
	//composites using their leafs in this example. similarly try for calculating prices of composites using
	//their leafs.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Leaf hd = new Leaf(2000, "Harddrive");
		Leaf ram = new Leaf(3000, "RAM");
		Leaf cpu = new Leaf(5000, "CPU");
		Component mouse = new Leaf(200, "Mouse");
		Component keyboard = new Leaf(1500, "Keyboard");
		
		//hd.show();
		
		Composite md = new Composite("Motherboard");
		Composite cb = new Composite("Cabinet");
		Composite pl = new Composite("Peripherel");
		Composite comp = new Composite("Computer");
		
		md.add(cpu);
		md.add(ram);
		//md.show();
		
		cb.add(hd);
		cb.add(md);
		//cb.show();

		pl.add(mouse);
		pl.add(keyboard);
		
		comp.add(cb);
		comp.add(pl);
		comp.show();
		
	}

}
