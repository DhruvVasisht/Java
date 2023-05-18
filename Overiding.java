class Bank{
    int getRateOfInterest(){return 0;}
}
class SBI extends Bank{
    int getRateOfInterest(){return 7;}
}

class ICICI extends Bank{
    int getRateOfInterest(){return 5;}
}
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}
class Test2{
    public static void main(String args[]){
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("BOI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("Citi Bank Rate of Interest: "+i.getRateOfInterest());
        System.out.println("Bank of Baroda Rate of Interest: "+a.getRateOfInterest());
    }
} 


