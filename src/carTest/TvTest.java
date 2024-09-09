package carTest;

class Tv {
    int chan;
}
public class TvTest {
    public static void main(String[] args) {
        Tv[] tv = new Tv[3];
        for(int i = 0; i < tv.length; i++) {
            tv[i] = new Tv();
            int c = (int)(Math.random()*100);
            tv[i].chan = c;
        }
        for(int i = 0; i < tv.length; i++) {
            System.out.println(tv[i].chan);
        }
    }
}
