package homework.homework_30.task_2.var_2;

public class CompareSuitColor implements Comparator<Suit>{
    @Override
    public int compare(Suit o1, Suit o2) {
        if(o1.getColor().ordinal() == (o2.getColor().ordinal()){
            return 0;}
        else if(o1.getColor().ordinal() > o2.getColor().ordinal()){
            return 1;
        }
        else
            return -1;
        }
    }

}
