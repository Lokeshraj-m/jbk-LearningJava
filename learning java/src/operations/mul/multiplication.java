package operations.mul;
import operations.variable.*;
public class multiplication {
	variable var = new variable();
	public double mul() {
		var.setC(2.5);
		var.setD(2);
		return var.getC()*var.getD() ;
	}

}
