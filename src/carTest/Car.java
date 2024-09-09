package carTest;

public class Car {
    int carNo;
    String carType;
    String color;
    static int weight = 100; //모든 차의 무게는 같다.

    static void goCar() {
        System.out.println("차가 출발합니다.");
    }

    static void stopCar() {
        System.out.println("차가 멈춥니다.");
    }

    public void getCarType() {
        System.out.println("이 차의 모델은 "+ carType +"입니다.");
    }
    public Car(int carNo, String carType, String color) {
        this.carNo = carNo;
        this.carType = carType;
        this.color = color;
    }
    public Car() {

    }
}
