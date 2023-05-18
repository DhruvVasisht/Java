package data;
public class Demo {
    public void show()
    {
        System.out.println("Hi Everyone");
    }
    public void view()
    {
        System.out.println("Hello");
    }
}
// code that uses the created package
import data.*;

class ncj {
 
    public static void main(String arg[])
    {
        Demo d = new Demo();
        d.show();
        d.view();
    }
}