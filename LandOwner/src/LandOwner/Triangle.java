package LandOwner;

import java.lang.Math;

public class Triangle implements Land {
	public double s;
	public double a;
	public double b;
	public double c;

	public Triangle(double s, double a, double b, double c) {
		super();
		this.s = s;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double computelandArea() {
		// TODO Auto-generated method stub
		return Math.sqrt((s - a) * (s - b) * (s - c));
	}

}
