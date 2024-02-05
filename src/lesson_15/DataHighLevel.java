package lesson_15;

public class DataHighLevel {

    int idHiLevel;
    DataMiddleLevel dataMiddleLevel;

    public DataHighLevel(int idHiLevel) {
        this.idHiLevel = idHiLevel;
    }

    @Override
    public String toString() {
        return "DataHighLevel{" +
                "idHiLevel=" + idHiLevel +
                '}';
    }
}
