package app.iqbal.kumpulanhadits.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import app.iqbal.kumpulanhadits.R;
import app.iqbal.kumpulanhadits.model.Doa;
import app.iqbal.kumpulanhadits.viewholder.DoaHolder;

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<Doa> doaList;
    Context context;

    public DoaAdapter(Context context, List<Doa> doaList) {
        this.doaList = doaList;
        this.context = context;
    }

    @NonNull
    @Override
    public DoaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_doa, viewGroup, false);
        return new DoaHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final DoaHolder holder, int position) {
        final Doa doa = doaList.get(position);
        holder.txtNamaDoa.setText(doa.getNama());
        holder.txtArtiDoa.setText(doa.getArti());
    }

    @Override
    public int getItemCount() {
        return doaList.size();
    }
}
