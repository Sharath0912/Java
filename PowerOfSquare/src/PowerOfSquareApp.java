import java.util.Scanner;

public class PowerOfSquareApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println(PowerOfSquare.squareNumber(num) );
	}

}
