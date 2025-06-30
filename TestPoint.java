package tester;
import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter x and y for point 1: ");
	        int x1 = sc.nextInt();
	        int y1 = sc.nextInt();
	        Point2D p1 = new Point2D(x1, y1);

	        
	        System.out.print("Enter x and y for point 2: ");
	        int x2 = sc.nextInt();
	        int y2 = sc.nextInt();
	        Point2D p2 = new Point2D(x2, y2);

	        
	        System.out.println("Point 1: " + p1.getDetails());
	        System.out.println("Point 2: " + p2.getDetails());

	        
	        if(p1.isEqual(p2)) {
	            System.out.println("both points are at the same");
	        } 
	        else {
	            double dist = p1.calculateDistance(p2);
	            System.out.printf("Points are different\n Distance = %.2f\n", dist);
	        }

	}

}