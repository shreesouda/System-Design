
public class Phone {

	private String os;
	private int battery;
	private int camera;
	private double size;
	private String processor;
	
	public Phone(String os, int battery, int camera, double size, String processor) {
		super();
		this.os = os;
		this.battery = battery;
		this.camera = camera;
		this.size = size;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", battery=" + battery + ", camera=" + camera + ", size=" + size + ", processor="
				+ processor + "]";
	}
	
}
