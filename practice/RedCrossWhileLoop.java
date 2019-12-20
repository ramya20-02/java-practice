import java.util.Scanner;
class RedCrossWhileLoop
{
    public static void main(String...arg) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
		{
            int[] arr = new int[n];
            int total = 0;
            int i=0;
			
            while(i<arr.length)
			{
               arr[i] = sc.nextInt();
               total = total + arr[i];
               i++;
            }
            System.out.println(total);          
        }
    }
}
