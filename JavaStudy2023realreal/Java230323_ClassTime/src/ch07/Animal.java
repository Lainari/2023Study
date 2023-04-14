package ch07;

public class Animal {
    private int weight;
    private String picture;

    protected void eat(){
        System.out.println("eat()이 호출되었음");
    }
    void sleep(){
        System.out.println("sleep()이 호출되었음");
    }
    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getPicture(){
        return picture;
    }

    public void setPicture(String picture){
        this.picture = picture;
    }
}
