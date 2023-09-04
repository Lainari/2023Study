package lambda;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    public enum Sex {
        MALE, FEMALE;
    }

    public Person(String name,Sex gender) {
        this.name = name;
        this.gender = gender;
    }

    private String name;
    LocalDate birthDay;
    private Sex gender;
    private String emailAddress;

    public int getAge() {
        return Period.between(birthDay, LocalDate.now()).getYears();
    }

    public Sex getGender() {
        return gender;
    }

    public String getName() { return name; }

    public void printPerson() {
        System.out.println("Name:" + name + " BirthDay: " + birthDay + " Gender: " + gender + " Email: " + emailAddress);
    }
}