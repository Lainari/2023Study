package objectClass;

public class Car {
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }

    String brand;
    String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public Car(){
        this("unknown","unknown");
    }

    // equals() 메소드의 재정의
    @Override
    public boolean equals(Object obj){
        // obj 가 Car 클래스의 인스턴스가 아니면 바로 false 를 반환하자
        // 자바에는 이 목적으로 사용할 수 있는 연산자(+, -, * /, %, ...)
        // instanceof 가 있다
        // 3+4 O, +(3, 4) X
        // obj.instanceof(Car)
        if (obj instanceof Car == false) return false;

        // obj 는 Car 클래스의 객체라 가정함
        // 그래야, Car 클래스의 인스턴스 Brand, Model 맴버에 접근할 수 있음
        // 하향 형변환
        Car yourCar = (Car)obj;
        // 자바에서는 String 형태에 한해서 똑같은 값이 있을 경우에는 이미 값이 있으므로 해당 참조 변수 값을 던져주므로
        // == 로 비교하기 보다는 .equals 로 비교하여 확인하는 것이 좋다
        if((yourCar.brand.equals(brand)) && (yourCar.model.equals(model))){
            return true;
        }
        return false;
    }
}
