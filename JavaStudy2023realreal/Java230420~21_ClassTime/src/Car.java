import interfacetest.Comparable;

public class Car implements Comparable{
    private String brand;
    private String model;
    private int speed;
    private int price;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    Car(String brand, String model, int speed, int price){
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public int compareTo(Comparable obj) {
        Car mycar = (Car) obj;
        if(price > mycar.price) {
            return 1;
        } else if (price == mycar.price) {
            return 0;
        }else{
            return -1;
        }
    }
}
