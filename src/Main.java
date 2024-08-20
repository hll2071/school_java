import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //클래스 클래스이름 = 객체 생성
        //스캐너라는 클래스로 객체를 찍어냄

        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine(); //입력을 String으로 가져온다
        //엔터를 입력할 때까지 입력받는 것
        System.out.println("입력한 문자열 : " + str);

        System.out.print("정수를 입력하세요 : ");
        int intValue = sc.nextInt();
        System.out.println("입력한 정수 : "+ intValue);

        System.out.print("실수를 입력하세요 : ");
        double intDoouble = sc.nextDouble();
        System.out.println("입력한 실수 : "+ intDoouble);
    }
}