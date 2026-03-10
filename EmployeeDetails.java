package CLASS_HOME_WORK;
import java.util.Scanner;
public class EmployeeDetails{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name=sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id=sc.nextInt();

        System.out.print("Enter Salary");
        double salary = sc.nextDouble();


        System.out.println("\nEmployee Details:");
        System.out.println("Name :-" + name);
        System.out.println("ID :-"+ id);
        System.out.println("Salary :-"+ salary);
    }

}