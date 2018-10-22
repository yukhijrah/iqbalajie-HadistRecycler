package app.iqbal.kumpulanhadits.model;

import java.io.Serializable;

public class Doa implements Serializable {

    private String nama;
    private String surah;
    private String arti;

    public Doa(String nama, String surah, String arti) { //constructor
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
}
