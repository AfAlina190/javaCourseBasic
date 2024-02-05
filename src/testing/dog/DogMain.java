package testing.dog;

public class DogMain {
    public static void main(String[] args) {
        Dog myDog = new Dog("Luna", 2);
        myDog.bark();
        String dogInfo = myDog.getInfo();
        System.out.println(myDog.getInfo());
    }

}
