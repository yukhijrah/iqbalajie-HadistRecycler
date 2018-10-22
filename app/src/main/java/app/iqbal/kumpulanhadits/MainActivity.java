package app.iqbal.kumpulanhadits;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import app.iqbal.kumpulanhadits.adapter.DoaAdapter;
import app.iqbal.kumpulanhadits.model.Doa;

public class MainActivity extends AppCompatActivity {

    private List<Doa> doas = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.lst_doa);

        doaCollections();

        DoaAdapter doaAdapter = new DoaAdapter(getApplicationContext(), doas);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(doaAdapter);
    }

    private void doaCollections() {
        /* 1 */ doas.add(new Doa("Doa Sebelum Makan", "اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ", "Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka"));
        /* 2 */ doas.add(new Doa("Doa Sesudah Makan", "اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ", "Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam"));
        /* 3 */ doas.add(new Doa("Doa Sebelum Tidur", "بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ", "Dengan menyebut nama-Mu ya Allah, aku hidup dan aku mati"));
        /* 4 */ doas.add(new Doa("Doa Bangun Tidur", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ", "Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan"));
        /* 5 */ doas.add(new Doa("Doa Masuk Kamar Mandi", "اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ", "Ya Allah, aku berlindung pada-Mu dari godaan syetan  laki-laki dan syetan perempuan"));
        /* 6 */ doas.add(new Doa("Doa Keluar Kamar Mandi", "غُفْرَانَكَ الْحَمْدُ ِللهِ الَّذِىْ اَذْهَبَ عَنّى اْلاَذَى وَعَافَانِىْ", "Dengan mengharap ampunanMu, segala puji milik Allah yang telah menghilangkan kotoran dari badanku dan yang telah menyejahterakan."));
        /* 7 */ doas.add(new Doa("Doa Ketika Bercermin", "اَلْحَمْدُ ِللهِ كَمَا حَسَّنْتَ خَلْقِىْ  فَحَسِّـنْ خُلُقِىْ", "Segala puji bagi Allah, baguskanlah budi pekertiku sebagaimana Engkau telah membaguskan rupa wajahku"));
        /* 8 */ doas.add(new Doa("Doa Memakai Pakaian", "بِسْمِ اللهِ اَللّٰهُمَّ اِنِّى اَسْأَلُكَ مِنْ خَيْرِهِ وَخَيْرِ مَاهُوَ لَهُ وَاَعُوْذُبِكَ مِنْ شَرِّهِ وَشَرِّمَا هُوَلَهُ", "Dengan nama-Mu yaa Allah akku minta kepada Engkau kebaikan pakaian ini dan kebaikan apa yang ada padanya, dan aku berlindung kepada Engkau dari kejahatan pakaian ini dan kejahatan yang ada padanya"));
        /* 9 */ doas.add(new Doa("Doa Melepas Pakaian", "بِسْمِ اللهِ الَّذِيْ لاَ إِلَهَ إِلَّا هُوَ", "Dengan nama Allah yang tiada Tuhan selain-Nya"));
        /* 10 */ doas.add(new Doa("Doa Memohon Ilmu Yang Bermanfaat", "اَللّٰهُمَّ اِنِّى اَسْأَلُكَ عِلْمًا نَافِعًا وَرِزْقًا طَيِّبًا وَعَمَلاً مُتَقَبَّلاً", "Ya Allah, sesungguhnya aku mohon kepada-Mu ilmu yang berguna, rezki yang baik dan amal yang baik Diterima."));
    }
}
