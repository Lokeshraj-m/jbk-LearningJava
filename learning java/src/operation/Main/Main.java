package operation.Main;
import operations.add.addition;
import operations.sub.subtraction;
import operations.variable.variable;
import operations.mul.multiplication;
import operations.div.division;
import operations.mod.modulus;
import operations.square.squ;
import operations.cube.cube;
import operations.average.ave;
import operations.areaOfCircle.circle;
import operations.areaOfRectangle.rectangle;
import operations.areaOfTriangle.triangle;
public class Main {

	public static void main(String[] args) {
		variable var = new variable();
		System.out.println(var.toString());
		addition a = new addition();
		System.out.println(a.add());
		subtraction s = new subtraction();
		System.out.println(s.sub());
		multiplication m = new multiplication();
		System.out.println(m.mul());
		division d = new division();
		System.out.println(d.div());
		modulus mod = new modulus();
		System.out.println(mod.mod());
		squ sq = new squ();
		System.out.println(sq.square());
		cube cu = new cube();
		System.out.println(cu.cu());
		ave av = new ave();
		System.out.println(av.average());
		circle c =new circle();
		System.out.println(c.areaOfCircle());
		rectangle r = new rectangle();
		System.out.println(r.areaOfRectangle());
		triangle aot = new triangle();
		System.out.println(aot.areaOfTriangle());
		
	}
}
