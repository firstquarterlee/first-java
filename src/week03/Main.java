package week03;

public class Main {
    public static void main(String[] args) {
        // 생성자를 호출 하기위해서 new 키워드를 이용하는구나! 알 수 있다.
        // 새로운 객체를 만들어 달라는 명령어구나!
//        Car car1 = new Car();
//        Car car2 = new Car();
        Car[] carArray = new Car[3];
        Car car1 = new Car();
        car1.changeGear('P');
        carArray[0] = car1;

        Car car2 = new Car();
        car2.changeGear('N');
        carArray[1] = car2;

        Car car3 = new Car();
        car3.changeGear('D');
        carArray[2] = car3;

        for (Car car: carArray) {
            System.out.println("car.gear = " + car.gear);;
        }
    }
}

// 세팅했다는 얘기는 저장했다는 말
// 이것처럼 객체 안에서 다루어지는 이런 변수와 같은 데이터들을 우리는 필드라고 부른다. -> char gear; 이거...