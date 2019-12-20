import java.util.Scanner;
class RedCrossForLoop
{
    public static void main(String...arg) 
	{
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); 
	  {
        int[] arr = new int[n];
        int total = 0;
        for(int i=0; i<arr.length; i++)
		{
            arr[i] = sc.nextInt();
            total = total + arr[i];
        }
        System.out.println(total);          
      }
    }
}
