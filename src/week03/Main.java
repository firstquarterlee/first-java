package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성

        System.out.println("페달 밟기 전 car.gear = " + car.gear);
        // 메서드 호출 및 반환값을 저장
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLight();
        System.out.println("lights = " + lights);

        System.out.println();
        System.out.println("페달 밟기 후의 car.gear = " + car.gear);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);
    }
}






























//
//        // 초기값 기본 값 확인 : 초기값을 준 것은 그 값이 들어가고, 아닌 값은 default value가 set
//        System.out.println("car.model = " + car.model);
//        System.out.println("car.color = " + car.color);
//        System.out.println();
//
//        System.out.println("car.speed = " + car.speed);
//        System.out.println("car.gear = " + car.gear);
//        System.out.println("car.lights = " + car.lights);
//        System.out.println();
//
//        System.out.println("car.tire = " + car.tire);
//        System.out.println("car.door = " + car.door);
//        System.out.println();
//
//        // 필드 사용
//        car.color = "blue";
//        car.speed = 100;
//        car.lights = false;
//
//        System.out.println("car.color = " + car.color);
//        System.out.println("car.speed = " + car.speed);
//        System.out.println("car.lights = " + car.lights);
//    }
//}

//========================================================================================

        // 생성자를 호출 하기위해서 new 키워드를 이용하는구나! 알 수 있다.
        // 새로운 객체를 만들어 달라는 명령어구나!
//        Car car1 = new Car();
//        Car car2 = new Car();
//        Car[] carArray = new Car[3];
//        Car car1 = new Car();
//        car1.changeGear('P');
//        carArray[0] = car1;
//
//        Car car2 = new Car();
//        car2.changeGear('N');
//        carArray[1] = car2;
//
//        Car car3 = new Car();
//        car3.changeGear('D');
//        carArray[2] = car3;
//
//        for (Car car: carArray) {
//            System.out.println("car.gear = " + car.gear);;
//        }
//    }
//}

// 세팅했다는 얘기는 저장했다는 말
// 이것처럼 객체 안에서 다루어지는 이런 변수와 같은 데이터들을 우리는 필드라고 부른다. -> char gear; 이거...