import.util.Scanner;
public class Triangle {
	Scanner input = new scanner(system.in);
	System.out.println("Enter x1");
	double x1 = input.nextDouble();

	System.out.println("enter y1");
	double y1 = input.nextDouble();

	System.out.println("enter x2");
	double x2 = input.nextDouble();

	System.out.println("enter y2");
	double y2 = input.nextDouble();

	System.out.println("enter x3);
	double x3 = input.nextDouble();

	System.out.println("enter y3");
	double y3 = input.nextDouble();

	double s = ((x1 + y1) + (x2 + y2) + (x3 + y3)) / 2;
	double area =
	Math.sqrt (s *(s - (x1 - y1)) * (s - (x2 - y2)) * (s -(x3 - y3)));

	System.out.println("The area of the triangle is: " + area);

 	}

}
