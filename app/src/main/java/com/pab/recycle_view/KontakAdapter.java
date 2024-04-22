package com.pab.recycle_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.KontakViewHolder> {

    private List<Kontak> listContact;
    private OnContactClickListener listener;

    public KontakAdapter(List<Kontak> listContact) {
        this.listContact = listContact;
    }

    public interface OnContactClickListener {
        void onClick(View view, int position);
    }

    public void setListener(OnContactClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public KontakViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.kontak_item, viewGroup, false);
        return new KontakViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KontakViewHolder holder, int position) {
        Kontak item = listContact.get(position);
        holder.txtPhone.setText(item.getTelepon());
        holder.txtName.setText(item.getNama());
        Picasso.get().load(item.getLink_gambar())
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.imageContact);
    }

    @Override
    public int getItemCount() {
        return listContact.size();
    }

    public class KontakViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView imageContact;
        public TextView txtName;
        public TextView txtPhone;

        public KontakViewHolder(View itemView) {
            super(itemView);
            imageContact = itemView.findViewById(R.id.imageContact);
            txtName = itemView.findViewById(R.id.txtName);
            txtPhone = itemView.findViewById(R.id.txtPhone);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                listener.onClick(v, getAdapterPosition());
            }
        }

    }
}
