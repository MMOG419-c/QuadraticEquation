import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[]){
   Scanner scanner= new Scanner(System.in);
   System.out.println("Enter value of a:");
   double a = scanner.nextDouble();
   System.out.println("Enter value of b:");
   double b = scanner.nextDouble();
   System.out.println("Enter value of c:");
   double c = scanner.nextDouble();
   double x = b*b-4*a*c;
   if(x>=0){
     double root1 = (-b + Math.sqrt(b*b-4*a*c))/2*a;
     double root2 = (b - Math.sqrt(b*b-4*a*c))/2*a;
     
     System.out.println("Root1 is :" + root1);
     System.out.println("Root2 is :" + root2);
   }
    else{
      System.out.println("Root2 is not available");
    }
    }
 }