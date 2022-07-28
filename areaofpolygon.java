import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of sides:");
		int n = sc.nextInt();
		System.out.print("Enter length of a side");
		double s = sc.nextDouble();
		double angle = Math.toRadians(180/n);
		angle=Math.tan(angle);
		double area = ((n*s*s)/(4*angle));
		System.out.println(area);
		
	}
}
