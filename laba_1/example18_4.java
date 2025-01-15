import java.util.Scanner; 
 
public class example4{ 
 
	public static void main(String[] args) { 
 
		Scanner InCMD = new Scanner(System.in); 
		System.out.print("Input a number:"); 
		int num = InCMD.nextInt(); 
 
		System.out.printf("Your number: %d \n", num); 
		InCMD.close(); 
	} 
} 