import java.util.Scanner;
class SimpleInterest {
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter The Principal");
    int principal = sc.nextInt();
    System.out.print("Enter The rate");
    float Rate=sc.nextFloat();
    System.out.print("Enter The Time");
    int time= sc.nextInt();
    float simple=principal*Rate*time/100;

    System.out.print("Simple Interest"+simple);
   }
}

