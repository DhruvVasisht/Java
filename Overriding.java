class a {
    public int dhruv() {
        return 4;
    }

    public void mtd2() {
        System.out.println("i am method 2 of class a");
    }
}

class b extends a {
    @Override
    public void mtd2() {
        System.out.println("i am method 2 of class b");
    }

    public void mthd3() {
        System.out.println("i am method 1 of class b");
    }
}

class overriding {
    public static void main(String[] args) {
        a b = new a();
        b.mtd2();

        b n = new b();
        n.mtd2();
    }
}