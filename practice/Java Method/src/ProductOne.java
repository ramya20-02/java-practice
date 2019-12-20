
import java.util.Scanner;
public class ProductOne {
       
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              Product p = new Product();
              
              System.out.println("Enter the Product id ");
              long id= Integer.parseInt(sc.nextLine());
              p.setId(id);
              
              System.out.println("Enter the product name ");
              p.setProductName(sc.nextLine());
              
              System.out.println("Enter the Supplier name ");
              p.setSupplierName(sc.nextLine());
              
              p.display();
       
       
      }
 }
