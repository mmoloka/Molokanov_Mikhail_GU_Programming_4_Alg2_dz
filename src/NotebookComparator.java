import java.util.Comparator;

public class NotebookComparator implements Comparator<Notebook> {
    @Override
    public int compare(Notebook notebook1, Notebook notebook2) {
        if (notebook1.getPrice() > notebook2.getPrice())
            return 1;
        else if (notebook1.getPrice() < notebook2.getPrice())
            return -1;
        else {
            if (notebook1.getRam() > notebook2.getRam())
                return 1;
            else if (notebook1.getRam() < notebook2.getRam())
                return -1;
            else {
                if (notebook1.getBrand().ordinal() > notebook2.getBrand().ordinal())
                    return 1;
                else if (notebook1.getBrand().ordinal() < notebook2.getBrand().ordinal())
                    return -1;
                else return 0;
            }
        }
    }
}
