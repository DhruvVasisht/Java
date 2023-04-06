public class Objects {
    public static void main(String args[]) {
      
        Person p1 =new Person();
        p1.age=24;
        p1.name="Dhruv";
        //p1.display();
       p1.walk();
       p1.walk(4);
       
       
        Person p2 =new Person(24,"Chomu");
        //p2.age=14;
        //p2.name="Chomu";
        p2.display();
       
        System.out.println(Person.count);

        
    }
    
}

class Person{
    String name;
    int age;
    static int count;
    public Person(){
        count++;
    }

    public Person(int Newage, String name){
        age=Newage;
        this.name=name;
        
    }
    void display(){
        System.out.println(age+" "+name);
    }
    void walk(){
        System.out.println(age+" "+name);
    }
    void walk(int steps){
        System.out.println(age+" "+ name +" Walked " +steps);
    }
}