package pl.pp;

abstract class Ksiazka {
    protected String isbn;
    protected String tytul;
    protected String wydawca;
    protected int rokWydania;
    protected boolean wypozyczona;
    protected String jezyk;

    public Ksiazka(String isbn, String tytul, String wydawca, int rokWydania, String jezyk) {
        this.isbn = isbn;
        this.tytul = tytul;
        this.wydawca = wydawca;
        this.rokWydania = rokWydania;
        this.jezyk = jezyk;
        this.wypozyczona = false;
    }

    public void wypozycz() {
        if (!wypozyczona) {
            wypozyczona = true;
            System.out.println("Wypożyczono książkę: " + tytul);
        } else {
            System.out.println("Książka już wypożyczona.");
        }
    }

    public void zwroc() {
        if (wypozyczona) {
            wypozyczona = false;
            System.out.println("Zwrócono książkę: " + tytul);
        } else {
            System.out.println("Książka nie była wypożyczona.");
        }
    }

    public String getJezyk() {
        return jezyk;
    }

    public abstract String getGatunek();
}

interface Gatunek {
    String getGatunek();
}

class Beletrystyka extends Ksiazka implements Gatunek {
    public Beletrystyka(String isbn, String tytul, String wydawca, int rokWydania, String jezyk) {
        super(isbn, tytul, wydawca, rokWydania, jezyk);
    }

    @Override
    public String getGatunek() {
        return "Beletrystyka";
    }
}

class Podrecznik extends Ksiazka implements Gatunek {
    public Podrecznik(String isbn, String tytul, String wydawca, int rokWydania, String jezyk) {
        super(isbn, tytul, wydawca, rokWydania, jezyk);
    }

    @Override
    public String getGatunek() {
        return "Podręcznik";
    }
}

class Komiks extends Ksiazka implements Gatunek {
    public Komiks(String isbn, String tytul, String wydawca, int rokWydania, String jezyk) {
        super(isbn, tytul, wydawca, rokWydania, jezyk);
    }

    @Override
    public String getGatunek() {
        return "Komiks";
    }
}

class Manga extends Ksiazka implements Gatunek {
    public Manga(String isbn, String tytul, String wydawca, int rokWydania, String jezyk) {
        super(isbn, tytul, wydawca, rokWydania, jezyk);
    }

    @Override
    public String getGatunek() {
        return "Manga";
    }
}

public class mojaPiętnastaAplikacja {
    public static void main(String[] args) {
        Ksiazka k1 = new Beletrystyka("8328729679", "FALA", "You YA", 2023, "Polski");
        Ksiazka k2 = new Podrecznik("3544757544", "English Grammar in Use", "Raymond Murphy", 2019, "Angielski");
        Ksiazka k3 = new Komiks("1779523254", "DC Versus Marvel Omnibus", "Dc Comics", 2024, "Angielski");
        Ksiazka k4 = new Manga("1974710025", "Jujutsu Kaisen", "Viz Media", 2019, "Angielski");

        k1.wypozycz();
        k1.zwroc();
        System.out.println("Gatunek: " + k1.getGatunek());

        k2.wypozycz();
        k3.wypozycz();
        k4.wypozycz();
    }
}


