import java.util.*;
class SecureURL
{
  public static void main(String...arg)
  {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the string");
	String str1 = sc.nextLine();
	
	System.out.println("Enter the start string");
	String str2 = sc.nextLine();
	
	if(str1.startsWith(str2))
	{
	    System.out.println(str1+ "starts with https");	
	}
	else
	{
		System.out.println(str1+ "does not start with https");
	}
  }
}