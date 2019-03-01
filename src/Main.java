import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SklepInternetowy sklepInternetowy = new SklepInternetowy ();
        sklepInternetowy.createLista ();
        sklepInternetowy.sortowanie ();
        sklepInternetowy.zmianaZamuwienia ();
        sklepInternetowy.noweZamuwienie();
    }

}




