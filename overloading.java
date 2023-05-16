public class overloading {

    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}
}
class TestOverloading2{
    public static void main(String[] args){
        System.out.println(overloading.add(69,21));
        System.out.println(overloading.add(69.8,17.6));
    }}

