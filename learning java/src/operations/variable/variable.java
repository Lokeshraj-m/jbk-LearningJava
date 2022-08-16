package operations.variable;
public class variable {
	private int a;
	private int b;
	private double c;
	private double d;
	private float s;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public float getS() {
		return s;
	}
	public void setS(float s) {
		this.s = s;
	}
	public variable() {
	}
	@Override
	public String toString() {
		return "variable [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", s=" + s + "]";
	}
	

}
