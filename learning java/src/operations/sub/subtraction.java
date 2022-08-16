package operations.sub;
import operations.variable.variable;
public class subtraction {
	public int sub() {
		variable var = new variable();
		var.setA(20);
		var.setB(10);
		return var.getA()-var.getB();
	}
}
