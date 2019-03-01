import java.util.Comparator;

public class CompareToCena implements Comparator<Zamowienia> {
    @Override
    public int compare(Zamowienia o1, Zamowienia o2) {
        return Double.compare (o1.getCena (), o2.getCena ());
    }
}
