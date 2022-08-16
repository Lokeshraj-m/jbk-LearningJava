package operations.cube;
import operations.variable.*;
public class cube {
	public float cu() {
		variable var = new variable();
		var.setS(2.2f);
		return var.getS()*var.getS()*var.getS();
	}
}
