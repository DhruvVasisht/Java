import java.util.Scanner;
  class Add{
    public static void main(String args[]) {
        int a,b,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=sc.next();
        System.out.println("Enter The Number");
        a=sc.nextInt();
        System.out.println("Enter The 2nd Number");
        b=sc.nextInt();
        sum=a+b;
        System.out.println("Your Name:"+name);
        System.out.println("Sum:"+sum);

    }
  }
