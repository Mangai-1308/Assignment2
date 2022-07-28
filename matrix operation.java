//Perform addition
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int a[][] = {{1,4,6},{2,5,7},{3,8,9}};
		int b[][] = {{3,8,9},{1,5,6},{2,4,7}};
		int c[][] = new int[3][3];
		for(int i=0;i<3;i++){
		    for(int j=0;j<3;j++){
		        c[i][j]=a[i][j]+b[i][j];
		        System.out.print(c[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}
//Perform Subraction
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int a[][] = {{1,4,6},{2,5,7},{3,8,9}};
		int b[][] = {{3,8,9},{1,5,6},{2,4,7}};
		int c[][] = new int[3][3];
		for(int i=0;i<3;i++){
		    for(int j=0;j<3;j++){
		        c[i][j]=a[i][j]-b[i][j];
		        System.out.print(c[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}
//Perform Multiplication
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int a[][] = {{1,4,6},{2,5,7},{3,8,9}};
		int b[][] = {{3,8,9},{1,5,6},{2,4,7}};
		int c[][] = new int[3][3];
		for(int i=0;i<3;i++){
		    for(int j=0;j<3;j++){
		        c[i][j]=0;
		        for(int k=0;k<3;k++){
		            c[i][j]+=a[i][k]*b[k][j];
		        }
		        System.out.print(c[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}
