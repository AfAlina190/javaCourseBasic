package homework.homework_30.task_2.var_2;

public class Suit {
    private Color color;
    private Size size;
    private MaterialType material;

    public Suit(Color color, Size size, MaterialType material) {
        this.color = color;
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Chemodan{" +
                "color=" + color +
                ", razmer=" + size +
                ", material=" + material +
                '}';
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public MaterialType getMaterial() {
        return material;
    }
}