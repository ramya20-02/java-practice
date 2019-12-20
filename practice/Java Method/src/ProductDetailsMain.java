import java.util.Scanner;
public class ProductDetailsMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductDetails p=new ProductDetails();
		
		System.out.println("Enter the Product Id");
		long Id=Integer.parseInt(sc.nextLine());
		p.setId(Id);
		
		System.out.println("Enter the product name");
		p.setproductName(sc.nextLine());
		
		System.out.println("Enter the supplier name");
		p.setsupplierName(sc.nextLine());
		
		System.out.println("Product Id is " +p.getId());
		System.out.println("Product Name is  " +p.getproductName());
		System.out.println("Supplier Name is " +p.getsupplierName());
		
		
		

	}

}
