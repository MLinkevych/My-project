package schoolMarksProject;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Grade> {
    @Override
    public int compare(Grade o1, Grade o2) {
        if(o1.avgScore(o1)> o2.avgScore(o2))
            return 1;
        else if(o1.avgScore(o1)< o2.avgScore(o2))
            return -1;
        else
            return 0;
    }
}
