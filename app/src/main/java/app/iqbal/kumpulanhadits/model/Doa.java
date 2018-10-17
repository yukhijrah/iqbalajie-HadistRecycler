package app.iqbal.kumpulanhadits.model;

public class Doa {

    private String nama;
    private String surah;
    private String arti;

    public Doa(String nama, String arti, String surah) { //constructor
        this.nama = nama;
        this.surah = surah;
        this.arti = arti;
    }

    public String getNama() {
        return nama;
    }

    public String getSurah() {
        return surah;
    }

    public String getArti() {
        return arti;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSurah(String surah) {
        this.surah = surah;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }
}
