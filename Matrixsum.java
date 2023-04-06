import java.util.Scanner;  
public class Matrixsum  
{  
public static void main(String[] args)   
{  
int m,n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of rows and cols you want to store: ");  


m=sc.nextInt();
n=sc.nextInt();  

int[][] a = new int[10][10];  
int[][] b = new int[10][10];
System.out.println("Enter the elements of the first array: ");  
for(int i=0;i<m;i++)
for(int j=0; j<n; j++)  
{  
{
 
a[i][j]=sc.nextInt();  
} 
} 
System.out.println("Enter the elements of the second array: ");  
for(int i=0;i<m;i++)
for(int j=0; j<n; j++)  
{  
{

b[i][j]=sc.nextInt();  
} 
}
int c[][]=new int[10][10];  
 System.out.println("Array after addition: ");     
   
	for(int i=0;i<m;i++)
		{    
		for(int j=0;j<n;j++)
0		    {    
		  c[i][j]=a[i][j]+b[i][j];   
		  System.out.print(c[i][j]+" ");    
		    }    
		System.out.println();
		}  
}  
}