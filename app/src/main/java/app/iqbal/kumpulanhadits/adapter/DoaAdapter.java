package app.iqbal.kumpulanhadits.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import app.iqbal.kumpulanhadits.DetailActivity;
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
    public DoaHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doa, parent, false);
        final DoaHolder doaHolder = new DoaHolder(itemView);

        //Intent untuk perpindahan dari Main ke Detail
        doaHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = doaHolder.getAdapterPosition();
                Intent intent = new Intent(doaHolder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("id_doa", doaList.get(position));

                doaHolder.itemView.getContext().startActivity(intent);
            }
        });
        return doaHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final DoaHolder holder, int position) {
        final Doa doa = doaList.get(position);
        holder.txtNamaDoa.setText(doa.getNama());
        holder.txtArtiDoa.setText(doa.getArti());
    }

    @Override
    public int getItemCount() {
        return doaList.size();
    }
}
