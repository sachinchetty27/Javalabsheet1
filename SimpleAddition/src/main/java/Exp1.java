import java.util.Scanner;

public class Exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number A and B:"); 
        
        // Read the inputs
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // You mentioned D, but if you just want to sum A and B:
        int C = A + B; 
        
        System.out.println("total is : " + C);
    }
}
