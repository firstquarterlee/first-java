package week03.packageExample.main;

import week03.packageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {
        // 클래스의 일부분이며, 하위 패키지를 도트(.)로 구분한다.
//
//        week03.packageExample.pk1.Car car1 = new week03.packageExample.pk1.Car();
//        week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();
//
//        car1.hron();
//        car2.hron();
//
//
        Car car = new Car();
        week03.packageExample.pk2.Car pkCar = new week03.packageExample.pk2.Car();
        car.hron();
        pkCar.hron();
    }
}
