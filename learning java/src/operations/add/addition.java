package operations.add;
import operations.variable.variable;
public class addition {
	variable var = new variable();
	public int add() {
		var.setA(10);
		var.setB(20);
		return  var.getA()+var.getB();
	}
}
