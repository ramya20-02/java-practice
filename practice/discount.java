import java.util.*;
class DiscountCalculation
{
  public static void main(String...arg)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Price of item 1: ");
	float a = Float.parseFloat(sc.nextLine());
	
	System.out.println("Price of item 2: ");
	float b = Float.parseFloat(sc.nextLine());
	
	System.out.println("Discount in percentage ");
	int d = Integer.parseInt(sc.nextLine());
	
	float C = a + b;
	float S = (C / 10);
	float D = (C - S);
	
	System.out.println("Total amount: $"+C);
	System.out.println("Discounted amount: $"+D);
	System.out.println("Saved amount: $"+S);
  }
}
	