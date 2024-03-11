package Entities;

public class Student extends Person {
    String controlNumber;
    @Override
    public String toString() {
        return "Entities.Student{" +
                "controlNumber='" + controlNumber + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Student(String name, String lastName, String controlNumber) {
        super(name, lastName);
        this.controlNumber = controlNumber;
    }
}
