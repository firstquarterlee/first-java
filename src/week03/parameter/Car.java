package week03.parameter;

public class Car {

    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태


    Tire tire;
    Door door = new Door();
    Handle handle = new Handle();

    public Car() {

    }

    public Car(String modelName) {
        model = modelName;
    }

    public Car(String modelName, String colorName) {
        model = modelName;
        color = colorName;
    }

    public Car(String modelName, String colorName, double priceValue) {
        model = modelName;
        color = colorName;
        price = priceValue;
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal(char type) {
        speed = 0;
        type = 'P';
        changeGear(type);
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵");
    }


    Tire setTire(Tire tireCompany) {
        tireCompany.company = "KIA";
        tire = tireCompany;
        return tire;
    }
}