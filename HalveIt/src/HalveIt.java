import java.util.Scanner;

public class HalveIt { 
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		double num=scan.nextDouble();
		double res = halveTheNumber(num);
		System.out.printf("%.2f",res);
		
	}
	public static double halveTheNumber(double num) 
	{
		return num/2;
	}
}
