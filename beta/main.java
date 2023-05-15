public class Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai("Budi", 5000000);
        System.out.println("Gaji Pegawai 1: " + p1.getGaji());

        Manajer m1 = new Manajer("Siti", 7000000, 50000);
        System.out.println("Gaji Manajer 1: " + m1.getGaji());
        System.out.println("Tunjangan Lembur per Jam Manajer 1: " + m1.getTunjanganLemburPerJam());

        m1.addOvertime(5);
        System.out.println("Gaji Bersih Manajer 1: " + m1.gajiBersih());
        m1.resetOvertime();
    }
}
