import java.util.Scanner;

public class TheFinanceCalculator 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the principal:");
		double p=scan.nextDouble();
		System.out.println("Enter the rate:");
		double r=scan.nextDouble();
		System.out.println("Enter the time:");
		double t=scan.nextDouble();
		
		FinanceCalculator calculator = new FinanceCalculator();
	
		System.out.printf("%.2f",calculator.calculateSimpleInterest(p, r, t));
	}
}
