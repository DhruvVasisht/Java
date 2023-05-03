import java.util.Scanner;
class reverse{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter The Number");
        n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(n>0){
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;

        }
     System.out.println("Reverse Of Number"+rev);
     if(rev==temp){
        System.out.print("Pallindrome");
     }   
     else{
        System.out.println("Not a Palindrome");
    }
    }
}
