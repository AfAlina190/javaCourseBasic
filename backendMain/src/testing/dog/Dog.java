package testing.dog;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void bark(){
        System.out.println("Wooof!");
    }
    public String getInfo() {
        return "Name: " + this.name + ", Age: " + this.age;
    }
}