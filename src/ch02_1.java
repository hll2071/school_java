public class ch02_1 {
    public static void main(String[] args) {
        String str1= "abc";
        String str2 = new String("abc");
        System.out.printf("%b%n", "abc"=="abc");
        System.out.printf("%b%n", str1=="abc");
        System.out.printf("%b%n", str2=="abc");
        System.out.printf("%b%n", str1.equals("abc"));
        System.out.printf("%b%n", str2.equalsIgnoreCase("ABC"));

        Loop1 : for(int i=2;i<10;i++) {
            for(int j=1;j<10;j++) {
                if(j==5) break Loop1;
                System.out.printf("%d X %d = %d\n",i,j,i*j);
            }
        }
    }
}
