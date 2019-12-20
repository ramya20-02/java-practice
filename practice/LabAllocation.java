import java.util.*;
class LabAllocation
{
  public static void main(String...arg)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter x ");
	int x = Integer.parseInt(sc.nextLine());
	
	
	System.out.println("Enter y ");
	int y = Integer.parseInt(sc.nextLine());
	
	System.out.println("Enter z ");
	int z = Integer.parseInt(sc.nextLine());
	
	if(x < y && x < z)
    {
		System.out.println("L1 has the minimal seating capacity");
	}
	else
		if(y < z)
		{
			System.out.println("L2 has the minimal seating capacity");
		}
		else
		{
			System.out.println("L3 has the minimal seating capacity");
		}
  }
}