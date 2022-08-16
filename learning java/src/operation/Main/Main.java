package operation.Main;
import operations.add.*;
import operations.sub.*;
import operations.variable.variable;
import operations.mul.*;
import operations.div.*;
import operations.mod.*;
import operations.square.*;
import operations.cube.*;
import operations.average.*;
import operations.areaOfCircle.*;
import operations.areaOfRectangle.*;
import operations.areaOfTriangle.*;
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
