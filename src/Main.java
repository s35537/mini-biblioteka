public class Main {
    public static void main(String[] args) {
        Biblioteka bib = new Biblioteka(10);

        Ksiazka k1 = new Ksiazka("Wiedzmin", "Sapkowski", 332, true);
        Ksiazka k2 = new Ksiazka("Silos", "Howey", 624, true);
        Ksiazka k3 = new Ksiazka("1984", "Orwell", 328, true);

        bib.dodajKsiazke(k1);
        bib.dodajKsiazke(k2);
        bib.dodajKsiazke(k3);

        Czytelnik c1 = new Czytelnik("Pawel", "Kowalski", 1001);

        System.out.println("--- Dostepne przed wypozyczeniem ---");
        bib.wypiszDostepneKsiazki();

        bib.wypozyczKsiazke("Silos", c1);
        c1.wypiszDane();

        System.out.println("--- Dostepne po wypozyczeniu ---");
        bib.wypiszDostepneKsiazki();

        bib.zwrocKsiazke("Silos", c1);

        System.out.println("--- Dostepne po zwrocie ---");
        bib.wypiszDostepneKsiazki();

        System.out.println("Liczba dostepnych: " + bib.policzDostepneKsiazki());
    }
}