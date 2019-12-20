
import java.util.Scanner;

public class MainMethod {

                public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);  
              
              Account acc= new Account();

              System.out.println("Enter the Account Number");
              int accountNumber = Integer.parseInt(sc.nextLine());
              
              System.out.println("Enter the Account Balance");
              int getaccountBalance = Integer.parseInt(sc.nextLine());
              
              System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amoount ");
              int choice = Integer.parseInt(sc.nextLine());
              
              
              switch(choice) {
              
              case 1:
              System.out.println("Enter the amount to deposit ");
              int amt =Integer.parseInt(sc.nextLine());
              getaccountBalance=getaccountBalance+amt;
              
               System.out.println("Your balance after the transaction is:" +getaccountBalance);
              break;
              
              case 2:
              System.out.println("Enter the amount to withdraw ");
              int wdl = Integer.parseInt(sc.nextLine());
              if (wdl > getaccountBalance) 
              {
                	System.out.println("Insufficient Balance");
              }
              else
              {
                    getaccountBalance = getaccountBalance - wdl;
              }
              System.out.println("Your balance after the transaction is:" + getaccountBalance);
              break;    
              }
       }

}

