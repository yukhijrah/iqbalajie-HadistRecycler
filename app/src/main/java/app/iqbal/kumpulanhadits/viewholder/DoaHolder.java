package app.iqbal.kumpulanhadits.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import app.iqbal.kumpulanhadits.R;

public class DoaHolder extends RecyclerView.ViewHolder {

    public TextView txtNamaDoa;
    public TextView txtSurah;
    public TextView txtArtiDoa;

    public DoaHolder(@NonNull View itemView) {
        super(itemView);
        txtNamaDoa = (TextView) itemView.findViewById(R.id.txt_nama_doa);
        txtSurah = (TextView) itemView.findViewById(R.id.txt_surah_doa);
        txtArtiDoa = (TextView) itemView.findViewById(R.id.txt_arti_doa);
    }
}
