import java.util.Comparator;

public class CompareToName implements Comparator<Zamowienia> {
    @Override
    public int compare(Zamowienia o1, Zamowienia o2) {
        return (o1.getNazwa ().compareTo (o2.getNazwa ()));
    }

}

