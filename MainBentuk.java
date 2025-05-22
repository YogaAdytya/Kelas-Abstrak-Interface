public class MainBentuk {
    public static void main(String[] args) {

        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("== Lingkaran ==");
        System.out.println("Jari-jari : " + lingkaran.getJari2());
        System.out.println("Luas      : " + lingkaran.luas());
        System.out.println(); 
        Tabung tabung = new Tabung(10, 5);
        System.out.println("== Tabung ==");
        System.out.println("Tabung - Jari-jari: " + tabung.getJari2() + 
                         ", Tinggi: " + tabung.getTinggi());
        System.out.println("Luas      : " + tabung.luas());
    }
}