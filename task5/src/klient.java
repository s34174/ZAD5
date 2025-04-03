import java.util.ArrayList;

public class klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<wydarzenie> listaRezerwacji = new ArrayList<>();

    public klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public String getImie() {return imie;}
    public String setImie(String imie) {this.imie = imie;return imie;}

    public String getNazwisko() {return nazwisko;}
    public void setNazwisko(String nazwisko) {this.nazwisko = nazwisko;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public ArrayList<wydarzenie> getListaRezerwacji() {return listaRezerwacji;}

    public void dodajRezerwacji(wydarzenie wydarzenie) {
        listaRezerwacji.add(wydarzenie);
        wydarzenie.zarezerwujMiejsce();
    }
    public void wyswietlRezerwacji() {
        for (wydarzenie w : listaRezerwacji) {
            System.out.println(w);
        }
    }
    public void anulujRezerwacji(wydarzenie wydarzenie) {
        if (listaRezerwacji.remove(wydarzenie)) {
            wydarzenie.anulujMiejsce();
        }
    }
}
