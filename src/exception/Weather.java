package exception;

import java.util.Scanner;

class NoSunnyException extends Exception {
    public NoSunnyException(String message) {
        super(message);
    }
    public NoSunnyException() {}
}
public class Weather {
    public void checkWeather(String weather) throws NoSunnyException {
        if(!weather.equalsIgnoreCase("Sunny")) {
            throw new NoSunnyException("Today is not Sunny");
        }
        else {
            System.out.println("Today is Sunny!!");
        }
    }
    public static void main(String[] args) {
        Weather weather = new Weather();
        Scanner sc = new Scanner(System.in);
        try {
            weather.checkWeather(sc.nextLine());
        }catch (NoSunnyException e) {
            System.out.println(e.getMessage());
        }
    }
}
