public class Main {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Wiedzmin", "Sapkowski", 332, true);
        Ksiazka k2 = new Ksiazka("Solaris", "Lem", 204, true);
        Ksiazka k3 = new Ksiazka("1984", "Orwell", 328, true);

        k1.wypiszInfo();
        k2.wypiszInfo();
        k3.wypiszInfo();

        Czytelnik c1 = new Czytelnik("Paweł", "Nowakowski", 1001);
        Czytelnik c2 = new Czytelnik("Kasia", "Kowalska", 1002);

        c1.wypiszDane();
        c1.zwiekszLiczbeWypozyczen();
        c1.wypiszDane();
        c2.wypiszDane();
    }
}