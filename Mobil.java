public class Mobil {
    private double hargaMobil;
    private double uangMuka;
    private double biayaAdmin;

    public Mobil(double hargaMobil, double uangMuka, double biayaAdmin) {
        this.hargaMobil = hargaMobil;
        this.uangMuka = uangMuka;
        this.biayaAdmin = biayaAdmin;
    }

    public double hitungSisaHutang(int bulan, double bunga, double angsuran) {
        double sisaHutang = hargaMobil - uangMuka + biayaAdmin;

        for (int i = 1; i <= bulan; i++) {
            double bungaPerBulan = sisaHutang * bunga / 100;
            double angsuranPokokPerBulan = angsuran - bungaPerBulan;
            double angsuranPerBulan = angsuranPokokPerBulan + bungaPerBulan;

            sisaHutang -= angsuranPokokPerBulan;
        }

        return sisaHutang;
    }
}
