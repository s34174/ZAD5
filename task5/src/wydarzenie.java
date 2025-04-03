public class wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostepneMiejsce = 0;
    private double cena;

    public wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public wydarzenie(String nazwa,Double cena,String data) {
         this(nazwa,cena);
         this.data = data;
    }
    public wydarzenie(String nazwa,Double cena,String data,String miejsce) {
        this(nazwa,cena,data);
        this.miejsce = miejsce;
    }
    public String getNazwa() {return nazwa;}
    public void setNazwa(String nazwa) {this.nazwa = nazwa;}

    public String getData() {return data;}
    public void setData(String data) {this.data = data;}

    public String getMiejsce() {return miejsce;}
    public void setMiejsce(String miejsce) {this.miejsce = miejsce;}

    public int getMaxLiczbaMiejsc() {return maxLiczbaMiejsc;}
    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {this.maxLiczbaMiejsc = maxLiczbaMiejsc;}

    public int getDostepneMiejsce() {return dostepneMiejsce;}

    public void setDostepneMiejsce(int dostepneMiejsce) {this.dostepneMiejsce = dostepneMiejsce;}

    public double getCena() {return cena;}
    public void setCena(double cena) {this.cena = cena;}

    public String toString() {
        return nazwa + "-" + data + "-" + miejsce + "- cena:" + cena;
    }
    public void zarezerwujMiejsce() {
        if (dostepneMiejsce < maxLiczbaMiejsc) {
            dostepneMiejsce++;
        }
    }
    public void anulujMiejsce() {
        if (dostepneMiejsce > 0) {
            dostepneMiejsce--;
        }
    }
}
