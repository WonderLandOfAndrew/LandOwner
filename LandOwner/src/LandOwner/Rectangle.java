package LandOwner;

public class Rectangle implements Land {
	public int length;
	public int width;

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	
	@Override
	public double computelandArea() {
		
		return length * width;
	}

}
