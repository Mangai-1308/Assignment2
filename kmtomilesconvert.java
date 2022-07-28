import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the kilometers to convert:");
		int kilometers = sc.nextInt();
		double Miles = kilometers/1.6;
		System.out.print("Equal Miles:"+Miles);
		
	}
}