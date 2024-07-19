package wearable;

public class WearableComputer implements Wearable {
	private String name;
	private int color;
	private String colorName;

	public WearableComputer(String name) {
		this.name = name;
	}

	public WearableComputer(String name, int color) {
		this.name = name;
		this.color = color;
	}

	@Override
	public void putOn() {
		System.out.println("♧ " + name + " ON !!!");
	}

	@Override
	public void putOff() {
		System.out.println("♧ " + name + " OFF ~~~");
	}

}
