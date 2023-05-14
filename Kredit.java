public class Kredit {
    private int tenor;
    private double bunga;

    public Kredit(int tenor, double bunga) {
        this.tenor = tenor;
        this.bunga = bunga;
    }

    public double hitungAngsuran(double sisaHutang) {
        double pokok = sisaHutang / tenor;
        double bungaPerBulan = sisaHutang * bunga / 100;
        double angsuranPerBulan = pokok + bungaPerBulan;

        return angsuranPerBulan;
    }
}
