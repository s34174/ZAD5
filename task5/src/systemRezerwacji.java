import java.util.ArrayList;
public class systemRezerwacji {
    private ArrayList<wydarzenie> wydarzenia = new ArrayList<>();
    private ArrayList<klient> klienci = new ArrayList<>();

    public void dodajWydarzenie(wydarzenie wydarzenie) {
        wydarzenia.add(wydarzenie);
    }

    public void dodajWydarzenie(String nazwa, double cena) {
        wydarzenia.add(new wydarzenie(nazwa, cena));
    }

    public void dodajKlienta(klient klient) {
        klienci.add(klient);
    }

    public void dodajKlienta(String imie, String nazwisko, String email) {
        klienci.add(new klient(imie, nazwisko, email));
    }

    public void dokonajRezerwacji(klient klient, wydarzenie wydarzenie) {
        klient.dodajRezerwacji(wydarzenie);
    }

    public wydarzenie znajdzWydarzenie(String nazwa) {
        for (wydarzenie w : wydarzenia) {
            if (w.getNazwa().equals(nazwa)) {
            }
            return null;
        }
    }

    public klient znajdzKlienta(String nazwisko) {
        for (klient k : klienci) {
            if (k.getNazwisko().equals(nazwisko)) {
            }
            return null;
        }
        public void zmienCenyWydarzenia (String nazwa,double cena){
            wydarzenie w = znajdzWydarzenie(nazwa);
            if (w != null) w.setCena(nowaCena);
        }
    }
}

