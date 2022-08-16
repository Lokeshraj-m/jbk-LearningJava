package operations.areaOfRectangle;
import operations.variable.variable;
public class rectangle {
	public double areaOfRectangle() {
		variable var = new variable();
		var.setC(50);
		var.setD(10);
		double areaOfRectangle = var.getC()*var.getD();
		return areaOfRectangle;
	}
}
