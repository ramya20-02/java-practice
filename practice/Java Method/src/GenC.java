import java.util.Scanner;
public class GenC {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        Trainee  g = new Trainee (969143, "John");
        Trainee  g1 = new Trainee (969144, "priya");
        
        System.out.println("Enter the number of GenCs");
        int gen = Integer.parseInt(s.nextLine());

        for (int i = 0; i < gen; i++) {
               System.out.println("Enter the Employee Id");
               int empId = Integer.parseInt(s.nextLine());
               g.setEmpId(empId);
               
               System.out.println("Enter the name");
               String name = s.nextLine();
               g.setName(name);
  
      }
        g.display();
        g1.display();
}
	  public void display() {
          System.out.println("+getEmpId() + getName() + COHORT_CODE ");
   }

	}
	