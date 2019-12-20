import java.util.*;
public class MainClass1 {

	public static void main(String[] args) {
	              Scanner sc = new Scanner(System.in);
	              Card cd1 = new MembershipCard("collin","45678","20/11/2021",10);
	              Card cd2 = new PaybackCard("Anandhi","12345", "14/01/2020", 1000, 50000);
	              
	              
	              System.out.println("Select the Card \r\n" + "\r\n" + "1.Payback Card \r\n" + "\r\n" + "2.Membership Card ");
	              int menu = Integer.parseInt(sc.nextLine());
	              

	              switch (menu) {
	              case 1:
	                     if (menu == 1) {
	                           System.out.print("Enter the Card Details:");
	                           String name=sc.nextLine();
	                           cd2.setHolderName(name);
	                           String number = sc.nextLine();
	                           cd2.setCardNumber(number);
	                           String d=sc.nextLine();
	                         cd2.setExpiryDate(d);
	                           
	                           System.out.println("Enter points in card  ");
	                           int point = Integer.parseInt(sc.nextLine());
	                           

	                           System.out.println("Enter Amount  ");
	                           double amt = Double.parseDouble(sc.nextLine());
	                cd2.display();
	                           break;
	                     }
	              case 2:
	                     if (menu == 2) {
	                           System.out.print("Enter the Card Details:");
	                           String name1=sc.nextLine();
	                           cd1.setHolderName(name1);
	                           String number1 = sc.nextLine();
	                           cd1.setCardNumber(number1);
	                           String d1=sc.nextLine();
	                           
	                           cd1.setExpiryDate(d1);
	                           
	                           System.out.println("Enter rating in card  ");
	                           long rate = Long.parseLong(sc.nextLine());
	                           cd1.display();
	                           break;
	                     }
	              default:
	                     System.out.println("Invalid Data");
	                     break;
	              }
	              
	        //cd1.display();
	        //cd2.display();
	       }


	}


