package lambda;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    public enum Sex {
        MALE, FEMALE;
    }

    public Person(String name, LocalDate birthDay, Sex gender, String emailAddress) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.emailAddress = emailAddress;
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

    public void printPerson() {
        System.out.println("Name:" + name + " BirthDay: " + birthDay + " Gender: " + gender + " Email: " + emailAddress);
    }
}