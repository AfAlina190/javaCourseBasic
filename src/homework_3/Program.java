package homework_3;

public class Program {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alina";
        person1.age = 32;
        person1.country = "Ukraine ";
        System.out.println("My name is "+ person1.name +".");
        System.out.println("I am "+ person1.age+ " years old.");
        System.out.println("I am from " + person1.country);
    }

}
