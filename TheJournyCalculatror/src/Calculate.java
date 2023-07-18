import java.util.Scanner;

public class Calculate 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		JourneyCalculator journeyCalculator = new JourneyCalculator();
		double res = journeyCalculator.calculateDistance(60.0, 1.5);
		System.out.printf("%.2f\n",res); 
		
		// 	System.out.printf("%.4f\n",journeyCalculator.calculateDistance(60.0, 1.5));
	}
}
