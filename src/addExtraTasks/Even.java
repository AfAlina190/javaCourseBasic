package addExtraTasks;

public class Even {
    int id;
    String name;
    public boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public Even(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Even() {
    }
}
