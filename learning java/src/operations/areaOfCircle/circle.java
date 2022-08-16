package operations.areaOfCircle;
import operations.variable.*;
public class circle {
	public double areaOfCircle() {
		variable var = new variable();
		var.setC(2.5);
		double areaOfCircle = Math.PI*(var.getC()*var.getC());
		return areaOfCircle;
	}
}
