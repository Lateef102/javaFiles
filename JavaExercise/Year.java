import java.util.Scanner;
  public class Years{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the number of minutes: ");
	int numberOfMinutes = input.nextint();
	
	int year = numberOfMinutes/525600;
	
	System.out.print("The year is " + year);
	
	}
	
}
