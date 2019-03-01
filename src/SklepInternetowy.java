import java.io.File;
import java.io.IOException;
import java.util.*;

public class SklepInternetowy {


    private ArrayList<Zamowienia> orderList;

    public SklepInternetowy() {
        orderList = createLista();
    }

    public ArrayList<Zamowienia> createLista() {
        try {
            File file = new File("zamowienia.txt");
            file.createNewFile();
            ArrayList<Zamowienia> listaZamowien = new ArrayList<>();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                listaZamowien.add(conversion(scanner.nextLine()));
            }
            return listaZamowien;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Zamowienia conversion(String lineFromFile) {
        List<String> listaZamowien1 = Arrays.asList(lineFromFile.split(","));
        double identyfikator = Double.parseDouble(listaZamowien1.get(0));
        String nazwa = listaZamowien1.get(1);
        int cena = Integer.parseInt(listaZamowien1.get(2));
        StanZamowienia stanZamowienia = StanZamowienia.valueOf(listaZamowien1.get(3));
        Zamowienia zamowienia = new Zamowienia(identyfikator, nazwa, cena, stanZamowienia);
        return zamowienia;
    }

    public void sortowanie() throws IOException {
        String a = "nazwa";
        String b = "cena";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz po czym chcesz sortowac");
        String sortowanie = scanner.nextLine();
        if (sortowanie.equals(a)) {
            Comparator comparator = new CompareToName();
            Collections.sort(orderList, comparator);
            System.out.println(orderList);
        }
        if (sortowanie.equals(b)) {
            Comparator comparator1 = new CompareToCena();
            Collections.sort(orderList, comparator1);
            System.out.println(orderList);
        }
    }

    public void zmianaZamuwienia() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id zamowienia");
        int idZamowienia = scanner.nextInt() - 1;
        scanner.nextLine();
        System.out.println(orderList.get(idZamowienia));
        System.out.println("zmien stan zamuwienia");
        String zmianaZamowienia = scanner.nextLine();
        orderList.get(idZamowienia).setStanZamowienia(StanZamowienia.valueOf(zmianaZamowienia));
        if (StanZamowienia.ANULOWANE.equals(orderList.get(idZamowienia).getStanZamowienia(StanZamowienia.ZREALIZOWANE))) {
            System.out.println("przesyłka już została wysłana");
        } else {
            System.out.println(orderList.get(idZamowienia));

        }
    }

    public Zamowienia noweZamuwienie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dodaj nowe zamowienie");
        Zamowienia newZamowienie = new Zamowienia(scanner.nextInt(), scanner.nextLine(), scanner.nextInt(), StanZamowienia.valueOf(scanner.nextLine()));
        System.out.println(newZamowienie);
        return newZamowienie;
    }

}




