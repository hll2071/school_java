public class random {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i < 6; i++) {
            num = (int)(Math.random()*6)+1;
            System.out.println(num);
        }
    }
}
