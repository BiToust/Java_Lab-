import java.util.Scanner;


public class example18_7{ 
 
	public static void main(String[] args) { 
 
	Scanner in = new Scanner(System.in); 
 
	System.out.print("Radius kruga: "); 
	int radius = in.nextInt(); 
	long area = Math.round(Math.PI * Math.pow(radius, 2)); 
	System.out.printf("S kruga s R %d = %d \n", radius, area); 
	} 
}