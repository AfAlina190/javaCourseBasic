package homework.homework_6.task_3;

public class Pizza {

    int diameter;
    int caloriesInOneCm;

    public Pizza(int diameter, int caloriesInOneCm) {
        this.diameter = diameter;
        this.caloriesInOneCm = caloriesInOneCm;
    }

    public double totalCaloriesInPizza(){
        double caloriesPizza = caloriesInOneCm * Math.PI * (diameter * diameter) / 4;
        return caloriesPizza;
    }

}