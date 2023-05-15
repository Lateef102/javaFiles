import java.util.Scanner;
public class ComparingIntergers{
	public static void main(String[] args){
		Scanner UserInput = new Scanner(System.in);
		
		System.out.print("Enter first interger");
		int number1 = UserInput.nextInt();
		//System.out.print("The sum is:" Sum);
		
		if (number1 > 100){
			System.out.printf("%d%n == 100", number1);
		}
		
		if (number1 < 100){
			System.out.printf("%d%n == 100", number1);
		}
		
		if (number1 == 100){
			System.out.printf("%d%n == 100", number1);
		}
		
		if (number1 != 100){
			System.out.printf("%d == 100", number1);
		}
		
	}
}
