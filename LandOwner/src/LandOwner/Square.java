package LandOwner;

public class Square implements Land {
	public int length;

	public Square(int length) {
		super();
		this.length = length;
	}

	@Override
	public double computelandArea() {

		return length * length;
	}

}
