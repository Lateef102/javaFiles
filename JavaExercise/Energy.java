import.util.Scanner;
    public class Energy{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter amount of water");
	double amountOfWater = input.nextdouble();
	
	System.out.print("Enter initial temperature: ");
	double initialTemperature = input.nextDouble();
	
	System.out.print("Enter final temperature: ");
	double finalTemperature = input.nextDouble();
	
	double energy =
	amountOfWater * (finalTemperature - initialTemperature) * 4184;
	
	System.out.println("The energy is: " + energy);
	
	}
	
}
	
