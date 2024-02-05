package lesson_15;

public class DataMiddleLevel {
    String label;
    DataLowLevel dataLevel;

    public DataMiddleLevel(String label, DataLowLevel dataLevel) {
        this.label = label;
        this.dataLevel = dataLevel;
    }

    @Override
    public String toString() {
        return "DataMiddleLevel{" +
                "label='" + label + '\'' +
                ", dataLevel=" + dataLevel +
                '}';
    }
}
