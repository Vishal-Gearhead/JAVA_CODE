package CLASS_HOME_WORK;
import java.util.Scanner;

public class CarDetails {
    public void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("This is a CAR Details");

        System.out.print("Enter Car Name :-");
        String CarName= sc.nextLine();

        System.out.print("Enter the Brand :-");
        String BrandName=sc.nextLine();

        System.out.print("Enter The Price of This Car :-");
        double price=sc.nextDouble();

        System.out.println();
        // Print the all value

        System.out.println("Here the Details of Car ");
        System.out.println("Car Name :- "+CarName);
        System.out.println("Brand :-"+BrandName);
        System.out.println("PRICE :-"+price);

        System.out.println("\nTHANKS YOU FOR VISITING ");
    }
}
