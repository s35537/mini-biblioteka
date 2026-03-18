public class Main {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Wiedzmin", "Sapkowski", 332, true);
        Ksiazka k2 = new Ksiazka("Silos", "Howey", 624, true);
        Ksiazka k3 = new Ksiazka("1984", "Orwell", 328, true);

        k1.wypiszInfo();
        k1.wypozycz();
        k1.wypiszInfo();
        k1.zwroc();
        k1.wypiszInfo();
    }
}