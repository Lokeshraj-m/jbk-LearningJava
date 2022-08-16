package operations.average;
import operations.variable.*;
public class ave {
	public double average() {
		variable var = new variable();
		var.setA(85);
		var.setB(15);
		double sum = var.getA()+var.getB();
		double average = sum/2;
		return average;
}
}
