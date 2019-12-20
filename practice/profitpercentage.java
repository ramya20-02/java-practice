import java.util.*;
class ProfitPercentage
{
  public static void main(String...arg)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number of dozens of toys purchased");
	int x = sc.nextInt();
	
    System.out.println("Enter the price per dozen");
	int y = sc.nextInt();
	
    System.out.println("Enter the selling price of 1 toy");
	int z = sc.nextInt();
	
	float cp = y / 12f;
    float p = z - cp;
    float pPercentage = (p / cp) * 100f; 
	System.out.println("Sam's profit percentage is " +pPercentage);	
  }
}