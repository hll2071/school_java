class Adds {
    public void add(int a,int b) {
        System.out.println(a+b);
    }
    public void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}

public class Add {
    public static void main(String[] args) {
        Adds a = new Adds();
        a.add(1,2);
        a.add(1,2,3);
    }
}
