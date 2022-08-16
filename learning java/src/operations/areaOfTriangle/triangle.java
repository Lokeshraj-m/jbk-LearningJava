package operations.areaOfTriangle;
import operations.variable.*;
public class triangle {
	public double areaOfTriangle() {
		variable var = new variable();
		var.setC(20);
		var.setD(10);
		double areaOfTriangle = (var.getC()*var.getD())/2;
		return areaOfTriangle;
	}
}
