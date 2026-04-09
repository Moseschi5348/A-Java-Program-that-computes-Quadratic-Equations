
import java.util.Scanner; 
public class Main{
    public static void main(String [] args){
        /* programme that computes Qudratic Equation using General formula*/
        // declare variables
        
        double coefficientA;
        double coefficientB;
        double coefficientC;
        // declare Roots
        double root1;
        double root2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first coefficient:");
        coefficientA = scanner.nextDouble();
         System.out.print("Enter the second  coefficient:");
        coefficientB = scanner.nextDouble();
         System.out.print("Enter the third coefficient:");
        coefficientC = scanner.nextDouble();
        // formula 
        double determinant = ((coefficientB * coefficientB)  - (4 * coefficientA * coefficientC));
        
        if(determinant > 0){
          root1 = (- coefficientB + Math.sqrt(determinant))/ (2 * coefficientA);
           root2 = (-coefficientB - Math.sqrt(determinant)) /    (2 * coefficientA);
            System.out.printf("Root1 is %.0f%n:",root1);
            System.out.printf("Root2 is %.0f%n:",root2);
            
        }
        else if(determinant == 0){
            root1 = root2 =  -coefficientB /(2 * coefficientA);
            System.out.printf("Root1 is %.0f%n :", root1);
            System.out.printf("Root2 is %.0f%n :" , root2);
        }
        else{
        double real = -coefficientB / (2 * coefficientA);
        double imaginary = Math.sqrt (-determinant) / (2 * coefficientA);
        System.out.printf("Root1 is %.0f%n:", real + imaginary);
        System.out.printf("Root2 is %.0f%n:", real + imaginary);
        }
        
    }
}
