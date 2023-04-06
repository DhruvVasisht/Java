import java.util.Scanner;

public class ISBN_Number {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] num = new int[9];

        System.out.println("Enter the first 9 digits of the an ISBN as integer: ");

        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < 10; j++) {
                num[i] = s.nextInt() * j;
            }
        }

       
    }
}
