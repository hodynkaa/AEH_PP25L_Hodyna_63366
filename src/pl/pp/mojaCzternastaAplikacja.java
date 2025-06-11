package pl.pp;
abstract class Pojazd {
    protected String nrRejestracyjny;
    protected String numerVin;
    protected String kolor;
    protected double cena;
    protected double spalanie;
    protected double poziomPaliwa;
    protected double przebieg;

    public Pojazd(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.numerVin = numerVin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.poziomPaliwa = poziomPaliwa;
        this.przebieg = przebieg;
    }

    public void zatankuj(double ilosc) {
        poziomPaliwa += ilosc;
        System.out.println("Zatankowano: " + ilosc + "L. Obecny poziom paliwa: " + poziomPaliwa + "L");
    }

    public abstract void prowadz(double dystans);
}

interface TypPaliwa {
    String getTypPaliwa();
}

class Osobowe extends Pojazd implements TypPaliwa {
    private int liczbaDrzwi;
    private String typPaliwa;

    public Osobowe(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, int liczbaDrzwi, String typPaliwa) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.liczbaDrzwi = liczbaDrzwi;
        this.typPaliwa = typPaliwa;
    }

    @Override
    public void prowadz(double dystans) {
        double zuzycie = (dystans / 100.0) * spalanie;
        if (poziomPaliwa >= zuzycie) {
            przebieg += dystans;
            poziomPaliwa -= zuzycie;
            System.out.println("Przejechano: " + dystans + " km. Pozostało paliwa: " + poziomPaliwa + "L");
        } else {
            System.out.println("Za mało paliwa na trasę.");
        }
    }

    @Override
    public String getTypPaliwa() {
        return typPaliwa;
    }
}

class Ciezarowka extends Pojazd implements TypPaliwa {
    private double ladownosc;
    private String typPaliwa;

    public Ciezarowka(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, double ladownosc, String typPaliwa) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.ladownosc = ladownosc;
        this.typPaliwa = typPaliwa;
    }

    @Override
    public void prowadz(double dystans) {
        double zuzycie = (dystans / 100.0) * spalanie;
        if (poziomPaliwa >= zuzycie) {
            przebieg += dystans;
            poziomPaliwa -= zuzycie;
            System.out.println("Ciężarówka przejechała: " + dystans + " km.");
        } else {
            System.out.println("Za mało paliwa.");
        }
    }

    @Override
    public String getTypPaliwa() {
        return typPaliwa;
    }
}

class Motocykl extends Pojazd implements TypPaliwa {
    private boolean posiadaDostawke;
    private String typPaliwa;

    public Motocykl(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, boolean posiadaDostawke, String typPaliwa) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.posiadaDostawke = posiadaDostawke;
        this.typPaliwa = typPaliwa;
    }

    @Override
    public void prowadz(double dystans) {
        double zuzycie = (dystans / 100.0) * spalanie;
        if (poziomPaliwa >= zuzycie) {
            przebieg += dystans;
            poziomPaliwa -= zuzycie;
            System.out.println("Motocykl przejechał: " + dystans + " km.");
        } else {
            System.out.println("Brak paliwa.");
        }
    }

    @Override
    public String getTypPaliwa() {
        return typPaliwa;
    }
}

class SprzetBudowlany extends Pojazd implements TypPaliwa {
    private int przepracowaneGodziny;
    private String typPaliwa;

    public SprzetBudowlany(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, int przepracowaneGodziny, String typPaliwa) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.przepracowaneGodziny = przepracowaneGodziny;
        this.typPaliwa = typPaliwa;
    }

    @Override
    public void prowadz(double godziny) {
        double zuzycie = godziny * (spalanie / 10.0);
        if (poziomPaliwa >= zuzycie) {
            przepracowaneGodziny += godziny;
            poziomPaliwa -= zuzycie;
            System.out.println("Sprzęt pracował: " + godziny + " godz.");
        } else {
            System.out.println("Brak paliwa.");
        }
    }

    @Override
    public String getTypPaliwa() {
        return typPaliwa;
    }
}

public class mojaCzternastaAplikacja {
    public static void main(String[] args) {
        Osobowe osobowe = new Osobowe("CSW21829", "KNAGT415AJ5247731", "Szary", 57000, 6.2, 40, 172000, 4, "Diesel");
        Ciezarowka ciezarowka = new Ciezarowka("WL8941L", "VF610A365KD015463", "Biały", 123000, 12, 80, 523000, 5000, "Diesel");
        Motocykl motocykl = new Motocykl("MTK789", "JYAVP27Y3EA001472", "Czerwony", 36999, 4.5, 15, 14095, true, "Benzyna");
        SprzetBudowlany sprzet = new SprzetBudowlany("BUD999", "4HGCM82633A004355", "Zółty", 274000, 20, 60, 3000, 1000, "Diesel");

        osobowe.prowadz(100);
        osobowe.zatankuj(20);
        System.out.println("Typ paliwa: " + osobowe.getTypPaliwa());

        ciezarowka.prowadz(200);
        motocykl.prowadz(50);
        sprzet.prowadz(5);
    }
}

