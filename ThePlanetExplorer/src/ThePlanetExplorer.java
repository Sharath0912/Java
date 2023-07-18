import java.util.Scanner;

public class ThePlanetExplorer 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius:");
		double r = scan.nextDouble();

		PlanetExplorer explorer = new PlanetExplorer();

	System.out.printf("%.2f",explorer.calculateSurfaceArea(r));
	}
}


