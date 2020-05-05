public class MainMhs {

    public static void main(String[] args) {
        Mhs m= new Mhs();

        m.setNama("Muhammad Cahaya Lazuardi");
        m.setNpm("18631156") ;
        m.setKelas("4-C TI BanjarBaru");
        m.setMatakuliah("Pemrograman Berbasis Objek 1");
        m.setDosen("Pak Mirza Yogi Kurniayawan");

        System.out.println("Nama : "+ m.getNama());
        System.out.println("Npm : "+ m.getNpm());
        System.out.println("Kelas : "+ m.getKelas());
        System.out.println("Mata Kuliah : "+ m.getMatakuliah());
        System.out.println("Dosen : "+ m.getDosen());
    }
}
