import java.util.Scanner;

public class Week2Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			System.out.println("What is your age: ");
			Scanner scanner = new Scanner(System.in);
			String inputValue = scanner.next();
			
			if ((Integer.parseInt(inputValue) >= 50) &&  (Integer.parseInt(inputValue)<= 300)) {
				System.out.print("Yes!");
			} else {
					System.out.print("No!");	
			}
		}
}
