public class Exceptionhandling {
    public static void main(String[] args) {
        try {
            int a=10,b=0;
            int result=a/b;
        }
        
        catch(ArithmeticException e){
            System.out.println("Exception Occured"+e);

        }

        try{
            int[]arr={1,2,3};
            int element=arr[4];
        }
        catch(ArrayIndexOutOfBoundsException w){
            System.out.println("Wrong Index"+w);


        }
        
    }}
