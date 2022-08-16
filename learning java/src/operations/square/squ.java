package operations.square;
import operations.variable.variable;
public class squ {
	variable var = new variable();
	public float square() {
		var.setS(2.2f);
		return var.getS()*var.getS();
	}
}
