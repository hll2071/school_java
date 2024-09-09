public class ex {
    public static void method1(int... values) {
        int sum = 0;
        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        method1(10,20,30,40,50);
    }
}
