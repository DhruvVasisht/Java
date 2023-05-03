import java.util.Scanner;
class Natural{
    public static void main(String args[]) {
        int a;
        int sum=0;
        System.out.print("Enter The Number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(int i=1; i<=a; i++){
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("Sum:"+sum);
    }
}
