package operators;
public class operators {
	int add(int a,int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	double mul(double a,double b) {
		return a*b;
	}
	double div(double a,double b) {
		return a/b;
	}
	int mod(int a,int b) {
		return a%b;
	}
	float square(float a) {
		return a*a;
	}
	float cube(float a) {
		return a*a*a;
	}
	double average(int a,int b) {
		double sum = add(a, b);
		double average = div(sum, 2);
		return average;
	}
	double areaOfCircle(double radius) {
		double areaOfCircle = Math.PI*mul(radius, radius);
		return areaOfCircle;
	}
	double areaOfRectangle(double length,double width) {
		double areaOfRectangle = mul(length, width);
		return areaOfRectangle;
	}
	double areaOfTriangle(double base,double height) {
		double areaOfTriangle = mul(base,height)/2;
		return areaOfTriangle;
	}
	public static void main(String[] args) {
		operators op = new operators();
		System.out.println("Addition = "+op.add(40, 20));
		System.out.println("Subtraction = "+op.sub(40, 10));
		System.out.println("Multiplication = "+ op.mul(2.5, 2));
		System.out.println("Division = "+op.div(5, 2.5));
		System.out.println("Modulus = "+op.mod(2546, 250));
		System.out.println("Square = "+op.square(78));
		System.out.println("Cube = "+op.cube(3));
		System.out.println("Average = "+op.average(25, 100));
		System.out.println("Area of Circle = "+op.areaOfCircle(2.5));
		System.out.println("Area of Rectangle = "+op.areaOfRectangle(52, 23));
		System.out.println("Area of Triangle = "+op.areaOfTriangle(10, 20));
	}

}
