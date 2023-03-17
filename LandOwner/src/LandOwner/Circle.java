package LandOwner;

public class Circle implements Land {
	public double pi = 3.14;
	public int r;

	public Circle(double pi, int r) {
		super();
		this.pi = pi;
		this.r = r;
	}

	@Override
	public double computelandArea() {
		// TODO Auto-generated method stub
		return pi * r * r;
	}

}
