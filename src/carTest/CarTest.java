package carTest;

import static carTest.Car.goCar;

public class CarTest {
    public static void main(String[] args) {
        Car[] car = new Car[3];
        Car myCar = new Car(5,"부가티","라임");
        for(int i = 0; i < car.length; i++){
            car[i] = new Car();
        }
        car[0].carNo = 1;
        car[0].carType = "페라리";
        car[0].color = "파랑";

        car[1].carNo = 2;
        car[1].carType = "벤틀리";
        car[1].color = "검정";

        car[2].carNo = 3;
        car[2].carType = "포르쉐";
        car[2].color = "하양";
        System.out.println("모든 차의 무개는" + car[0].weight +"입니다.");
        goCar();
        car[0].getCarType();
    }
}
