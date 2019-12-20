
import java.util.*;

public class Mainclass {

       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              Delivery del = new Delivery();

              System.out.println("1.Player details of the delivery \r\n" + "\r\n" + "2.Run details of the delivery ");
              int menu = Integer.parseInt(sc.nextLine());

              switch (menu) 
              {
		              case 1:
		                     if (menu == 1)
		                     {
		                           System.out.println("Enter the bowler name ");
		                           String bowl = sc.nextLine();
		
		                           System.out.println("Enter the batsman name ");
		                           String bat = sc.nextLine();
		
		                           del.displayDeliveryDetails(bowl, bat);
		                           break;
		                     }
		              case 2:
		                     if (menu == 2)
		                     { 
		                          System.out.println("Enter the number of runs ");
		                          long run = Long.parseLong(sc.nextLine());
		                          del.displayDeliveryDetails(run);
		                          if (run == 6) 
		                          {
		                                  System.out.println("It is a Sixer.");
		
		                          } 
		                         else
		                    	 if (run == 4) 
		                    	 {
		                                  System.out.println("It is a boundary.");
		                         }
		
		                     
		                         break;
                            }
                     default:
                     System.out.println("Invalid Data");
                     break;
              }

       }

}



