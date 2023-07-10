public class ClassesAndObjects {
    public static void main(String[] args) {
        Person.desc = "it's description not desc";
        Person.getDesc();
    }
}

class Person {
    private String name;
    private int age;
    public static String desc;

    public Person() {
        System.out.println("Hello world");
    }

    public static void getDesc() {
        System.out.println(desc);
    }

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    String getAge() {
        return "Age: " + this.age;
    }

    String getName() {
        return "Name: " + this.name;
    }

    String get() {
        return "Name: " + this.name + " Age: " + this.age;
    }
}