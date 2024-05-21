package JavaEncapsulation;

public class Person {
    // Private instance variables
    private String name;
    private int age;
    private String country;

    // Constructor
    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for country
    public String getCountry() {
        return country;
    }

    // Setter for country
    public void setCountry(String country) {
        this.country = country;
    }
}