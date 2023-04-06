import java.util.Scanner;  
public class addoftwomat   
{  
public static void main(String[] args)   
{  
int m,n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of rows and cols you want to store: ");  
//reading the number of elements from the that we want to enter  
m=sc.nextInt();
n=sc.nextInt();  
//creates an array in the memory of length 10  
int[][] a = new int[10][10];  
int[][] b = new int[10][10];
System.out.println("Enter the elements of the first array: ");  
for(int i=0;i<m;i++)
for(int j=0; j<n; j++)  
{  
{
//reading first array elements from the user   
a[i][j]=sc.nextInt();  
} 
} 
System.out.println("Enter the elements of the second array: ");  
for(int i=0;i<m;i++)
for(int j=0; j<n; j++)  
{  
{
//reading first array elements from the user   
b[i][j]=sc.nextInt();  
} 
}
int c[][]=new int[10][10];  //resultant matrix  
 System.out.println("Array after addition: ");     
//adding and printing addition of 2 matrices    
	for(int i=0;i<m;i++)
		{    
		for(int j=0;j<n;j++)
		    {    
		  c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
		  System.out.print(c[i][j]+" ");    
		    }    
		System.out.println();
		}  
}  
}