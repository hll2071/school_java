package exception;

import java.util.Scanner;

class MinusNumberException extends Exception {
    public MinusNumberException() {

    }
    public MinusNumberException(String message) {
        super(message);
    }
}
class OverNumberException extends Exception {
    public OverNumberException() {}
    public OverNumberException(String message) {
        super(message);
    }
}
class A {
    public int a;
    public void checkScore(int score) throws OverNumberException, MinusNumberException {
        if (score < 0) {
            throw new OverNumberException("음수는 입력되지 않습니다.");
        }
        else if (score > 100) {
            throw new OverNumberException("100이 넘어가는 수는 입력되지 않습니다.");
        }
        else {
            System.out.println(score);
        }
    }
}
public class ExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A a = new A();
        try {
            a.checkScore(sc.nextInt());
        }
        catch(MinusNumberException | OverNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
