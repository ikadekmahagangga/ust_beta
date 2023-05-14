public class Simulator {
    private Mobil mobil;
    private Kredit kredit;

    public Simulator(Mobil mobil, Kredit kredit) {
        this.mobil = mobil;
        this.kredit = kredit;
    }

    public void tampilkanSimulasi() {
        double sisaHutang = mobil.hitungSisaHutang(kredit.getTenor(), kredit.getBunga(), kredit.hitungAngsuran(mobil.hitungSisaHutang(0, 0, 0)));

        for (int i = 1; i <= kredit.getTenor(); i++) {
            double bungaPerBulan = sisaHutang * kredit.getBunga() / 100;
            double angsuranPokokPerBulan = kredit.hitungAngsuran(sisaHutang) - bungaPerBulan;
            double angsuranPerBulan = kredit.hitungAngsuran(sisaHutang);

            System.out.println("Bulan " + i);
            System.out.println("Bunga pinjaman setiap bulan
