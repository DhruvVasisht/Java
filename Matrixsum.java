import java.util.Scanner;
public class Matrixsum
{
    public static void main(String[] args)
    {
        int rows,cols;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and cols you want to store: ");
        rows=sc.nextInt();
        cols=sc.nextInt();
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        System.out.println("Enter the elements of the first matrix: ");
        for(int i=0;i<rows;i++)
            for(int j=0; j<cols; j++)
            {
                {

                    a[i][j]=sc.nextInt();
                }
            }
        System.out.println(" first matrix is : ");
        for(int i=0;i<rows;i++){
            for(int j=0; j<cols; j++)

                {

                    System.out.print(a[i][j]+" ");
                }
            System.out.println();
            }
        System.out.println("Enter the elements of the second matrix: ");
        for(int i=0;i<rows;i++)
            for(int j=0; j<cols; j++)
            {
                {

                    b[i][j]=sc.nextInt();
                }
            }


        System.out.println(" second matrix is : ");
        for(int i=0;i<rows;i++){
            for(int j=0; j<cols; j++)

                {
                    System.out.print(b[i][j]+" ");
                }
            System.out.println();
            }
        int c[][]=new int[10][10];
        System.out.println("Array after addition: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
		}}}
