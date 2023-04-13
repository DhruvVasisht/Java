class base {
    int x;

    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }

    public void prnt() {
        System.out.println("this line have been executed");
    }
}

class derived extends base {
    int y;

    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;
    }

}

class inheritance {
    public static void main(String[] args) {
        
        base ob = new base();
        ob.setx(6);
        System.out.println(ob.getx());
      


        // derived ob = new derived();
        // ob.sety(6);
        // System.out.println(ob.gety());

}
}