public class Test {
    public static void main(String[] args) {
        Car myCar = new Car("현대","아반테",10,1000);
        Car yourCar = new Car("기아","모닝",5,500);
        findLarger(myCar, yourCar);
    }

    public static void findLarger(Car c1, Car c2){
        if(c1.compareTo(c2) == 0){
            System.out.println("같다");
        } else if (c1.compareTo(c2) > 0) {
            System.out.println("첫 번째가 크다");
        }else{
            System.out.println("두 번째가 크다");
        }
    }
}
