import java.util.Scanner;
public class ProfitMain {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Profit p=new Profit();
		
		
		System.out.println("Enter the number of dozens of toys purchased");
		int x =Integer.parseInt(sc.nextLine());
				
	    System.out.println("Enter the price per dozen");
		int y = Integer.parseInt(sc.nextLine());
		
	    System.out.println("Enter the selling price of 1 toy");
		int z = Integer.parseInt(sc.nextLine());
		
	    float pPercentage=p.calculateProfit(x,y,z);
	    System.out.printf("Sam's profit percentage is %.2f  percent \n ",pPercentage);
	 
	}

}
