package collections;
import java.util.*;
public class Calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>list=new ArrayList<Integer>(n);
		for(int i=0 ; i<n ; i++)
		{
			list.add(sc.nextInt());
		}
		float sum = 0;
		for(int x:list)
		{
			sum = sum+x;
		}
		float average=sum/n;
		System.out.println(sum);
		System.out.printf("%.2f",average);

	}

}
