package operations.mod;
import operations.variable.variable;
public class modulus {
	variable var = new variable();
	public int mod() {
		var.setA(124);
		var.setB(10);
		return var.getA()%var.getB();
	}
}
