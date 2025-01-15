import java.util.Scanner; 
 
public class example18_8{ 
 
	public static void main(String[] args) { 
 
		Scanner in = new Scanner(System.in); 
		System.out.print("Введите Фамилию: "); 
		String lastName = in.nextLine();
		System.out.print("Введите Имя: ");
		String firstName = in.nextLine();
		System.out.print("Введите Отчество: ");
		String middleName = in.nextLine();
		System.out.println("Hallo " + lastName + ", " + firstName + ", " + middleName + "!");
		
		in.close(); 
	} 
} 