package homework.homework_41.task_3;

class Purchase {
    private String product;
    private double cost;

    public Purchase(String product, double cost) {
        this.product = product;
        this.cost = cost;
    }

    public String getProduct() {
        return product;
    }

    public double getCost() {
        return cost;
    }
}