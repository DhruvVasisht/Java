import java.util.Scanner;
class If{
   public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter Your Age :");
   int age= sc.nextInt();
   if(age>=18){
    System.out.print("You Can vote");
   }
   else{
    System.out.println("You Cannot Vote");
   }
   }
}
