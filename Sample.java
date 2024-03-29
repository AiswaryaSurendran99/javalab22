import java.util.Scanner;
interface Shape {
	double area();
	double perimeter();
}

class Rectangle implements Shape {

	double length;
	double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public double area() {

		return length * breadth;
	}
	public double perimeter() {

		return 2 * (length + breadth);
	}
}

class Circle implements Shape {

	double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	
	public double area() {

		return Math.PI * radius * radius;
	}

	
	public double perimeter() {

		return 2 * Math.PI * radius;
	}
}
public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m;
		double r,l,b;
		System.out.print("MENU:");
		System.out.print("\n1.Circle");
		System.out.print("\n2.Rectangle");
		System.out.print("\n3.Exit");
		System.out.print("\nEnter your choice:");
		m=s.nextInt();
		switch(m)
		{
			case 1:System.out.println("Enter the radius of circle:");
			       r=s.nextDouble();
				   Circle c = new Circle(r);
				   System.out.println("Area of Circle: " + c.area());
		           System.out.println("Perimeter of Circle:" + c.perimeter());
				   break;
		    case 2:System.out.println("Enter the length of Rectangle:");
			       l=s.nextDouble();
				   System.out.println("Enter the breadth of Rectangle:");
				   b=s.nextDouble();
				   Rectangle e = new Rectangle(l,b);
				   System.out.println("Area of Rectangle: " + e.area());
		           System.out.println("Perimeter of Rectangle:" + e.perimeter());
				   break;
		    case 3:	System.exit(0);
			       break;
		}

	}
}