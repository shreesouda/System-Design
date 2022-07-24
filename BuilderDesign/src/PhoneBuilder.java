
public class PhoneBuilder {
	
	private String os;
	private int battery;
	private int camera;
	private double size;
	private String processor;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}
	public PhoneBuilder setSize(double size) {
		this.size = size;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, battery, camera, size, processor);
	}
	
}
