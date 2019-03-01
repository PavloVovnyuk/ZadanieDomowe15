public class Zamowienia {
    private double indetyfikator;
    private String nazwa;
    private int cena;
    private StanZamowienia stanZamowienia;

    public Zamowienia(double indetyfikator, String nazwa, int ocena, StanZamowienia stanZamowienia) {
        this.indetyfikator = indetyfikator;
        this.nazwa = nazwa;
        this.cena = ocena;
        this.stanZamowienia = stanZamowienia;

    }

    public double getIndetyfikator() {
        return indetyfikator;
    }

    public void setIndetyfikator(double indetyfikator) {
        this.indetyfikator = indetyfikator;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int ocena) {
        this.cena = ocena;
    }

    public StanZamowienia getStanZamowienia(StanZamowienia zrealizowane) {
        return stanZamowienia;
    }

    public void setStanZamowienia(StanZamowienia stanZamowienia) {
        this.stanZamowienia = stanZamowienia;
    }

    @Override
    public String toString() {
        return "Zamowienia{" +
                "indetyfikator=" + indetyfikator +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", stanZamowienia=" + stanZamowienia +
                '}';
    }
}
