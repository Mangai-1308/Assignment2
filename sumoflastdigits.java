import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		a = a%10;
		b = b%10;
		c = c%10;
		int sum = a+b+c;
		System.out.println("Sum of the last digit:"+sum);
		
	}
}