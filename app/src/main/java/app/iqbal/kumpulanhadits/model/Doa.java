package app.iqbal.kumpulanhadits.model;

public class Doa {

    private String nama;
    private String arti;
    private String surah;

    public Doa(String nama, String arti, String surah) { //constructor
        this.nama = nama;
        this.arti = arti;
        this.surah = surah;
    }

    public String getNama() {
        return nama;
    }

    public String getArti() {
        return arti;
    }

    public String getSurah() {
        return surah;
    }
}
