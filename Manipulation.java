public class str_manipulation {
    public static void main(String[] args) {
            String str1= "I Like java";
            System.out.println("The length of the string: "+ str1.length());
            System.out.println("Actual String: "+str1);
            System.out.print("String reverse: ");
            for(int i = str1.length()-1; i>=0; i--){
                System.out.print(str1.charAt(i));
            }
        }

