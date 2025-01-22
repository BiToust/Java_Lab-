package project18_8;

public class lessen18_8 {
    
	public static void main(String[] args) {

        char[] cA = new char[10];

        int index = 0;

        for (char letter = 'A'; letter <= 'Z'; letter++) {
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            }

            if (index < cA.length) {
            	cA[index] = letter;
                index++;
            }
        }

        System.out.print("Массив с согласными буквами: ");
        for (char c : cA) {
            System.out.print(c + " ");
        }
    }
}