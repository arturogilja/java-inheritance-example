public class Student extends Person {
    @Override
    public String toString() {
        return "Student{" +
                "controlNumber='" + controlNumber + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    String controlNumber;
    public Student(String name, String lastName, String controlNumber) {
        super(name, lastName);
        this.controlNumber = controlNumber;
    }
}
