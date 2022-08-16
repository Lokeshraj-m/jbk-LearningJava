package operations.div;
import operations.variable.*;
public class division {
	public double div() {
		variable var = new variable();
		var.setC(50);
		var.setD(4);
		return var.getC()/var.getD();
	}
}
