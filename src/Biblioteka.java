public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Biblioteka jest pelna!");
        }
    }

    public void wypiszDostepneKsiazki() {
        System.out.println("Dostepne ksiazki:");
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                ksiazki[i].wypiszInfo();
            }
        }
    }

    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equalsIgnoreCase(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }

    public int policzDostepneKsiazki() {
        int licznik = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) licznik++;
        }
        return licznik;
    }

    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka k = znajdzKsiazkePoTytule(tytul);
        if (k != null && k.isDostepna()) {
            k.wypozycz();
            czytelnik.zwiekszLiczbeWypozyczen();
            System.out.println(tytul + " wypozyczona.");
        } else {
            System.out.println(tytul + " jest niedostepna.");
        }
    }

    public void zwrocKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka k = znajdzKsiazkePoTytule(tytul);
        if (k != null && !k.isDostepna()) {
            k.zwroc();
            czytelnik.zmniejszLiczbeWypozyczen();
            System.out.println(tytul + " zwrocona.");
        } else {
            System.out.println("Nie mozna zwrocic: " + tytul);
        }
    }
}