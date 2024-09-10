package carTest;

class Car2 {
    String color; // 색상
    String gearTypes; // 변속기 종류:auto(자동), manual (수동)
    int door; // 문의 개수
    public Car2(String color, String gearTypes, int door) {
        this.color = color;
        this.gearTypes = gearTypes;
        this.door = door;
    }
    public Car2() {
        this.color = "white";
        this.gearTypes = "auto";
        this.door = 4;
    }
    public Car2(String color) {
        this.color = color;
        this.gearTypes = "auto";
        this.door = 4;
    }
}
public class Ex {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");
        Car2 c3 = new Car2("black", "A", 2);

        System.out.println(c1.color + c1.gearTypes + c1.door);
        System.out.println(c2.color + c2.gearTypes + c2.door);
        System.out.println(c3.color + c3.gearTypes + c3.door);

//1. color, gearTypes, door 세 가지 정보를 모두 매개변수로 받는 생성자를 작성하시오.
//2. 매개변수가 없는 생성자 초기화 값을 채우시오. 단, 기본 디폴트 정보는 >> "white", "auto", 4
//3. 색깔만 매개변수로 전달받는 생성자를 작성하시오.

    }
}
