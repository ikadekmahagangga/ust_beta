class Pegawai {
    private String nama;
    private double gaji;

    public Pegawai(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double gajiBersih() {
        return gaji;
    }
}

class Manajer extends Pegawai {
    private double tunjanganLemburPerJam;
    private double overtime;

    public Manajer(String nama, double gaji, double tunjangan) {
        super(nama, gaji);
        this.tunjanganLemburPerJam = tunjangan;
        overtime = 0;
    }

    public double getTunjanganLemburPerJam() {
        return tunjanganLemburPerJam;
    }

    public void setTunjanganLemburPerJam(double tunjangan) {
        this.tunjanganLemburPerJam = tunjangan;
    }

    public double gajiBersih() {
        return super.getGaji() + (overtime * tunjanganLemburPerJam);
    }

    public void addOvertime(double jam) {
        overtime += jam;
    }

    public void resetOvertime() {
        overtime = 0;
    }
}
