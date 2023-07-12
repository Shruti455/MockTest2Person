// Class Person
class Person {
    private String name;
    private int age;
    private String address;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

// Main program
public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person = new Person();

        // Setting values using setter methods
        person.setName("Shruti Chowdhury");
        person.setAge(21);
        person.setAddress("Patna Bihar");

        // Displaying values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}

