public class Main {
    public static void main(String... args) {
        Person person1 = new Person("Arturo", "Gil");
        Person person2 = new Person("Arturo", "Gil");
        Student student1 = new Student("Roberto", "Garcia", "327816");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(student1);
        System.out.println("EQUAL: " + person1.equals(person2));
    }
}