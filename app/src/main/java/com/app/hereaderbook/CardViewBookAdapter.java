package com.app.hereaderbook;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewBookAdapter extends RecyclerView.Adapter<CardViewBookAdapter.CardViewViewHolder> {
    private ArrayList<Book> listBook;

    public CardViewBookAdapter(ArrayList<Book> list) {
        this.listBook = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_book, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {

        final Book book = listBook.get(position);

        Glide.with(holder.itemView.getContext())
                .load(book.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(book.getJudul());
        holder.tvDetail.setText(book.getDetail());

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), listBook.get(holder.getAdapterPosition()).getJudul(), Toast.LENGTH_SHORT).show();

                Intent goToDetail = new Intent(v.getContext().getApplicationContext(), MoreDetailBooks.class);
                goToDetail.putExtra("FOTO", book.getPhoto());
                goToDetail.putExtra("JUDUL", book.getJudul());
                goToDetail.putExtra("ABOUT", book.getMoreDetail());
                goToDetail.putExtra("DESKRIPSI", book. getDetail());

                v.getContext().startActivity(goToDetail);
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToDetail = new Intent(v.getContext().getApplicationContext(), MoreDetailBooks.class);
                goToDetail.putExtra("FOTO", book.getPhoto());
                goToDetail.putExtra("JUDUL", book.getJudul());
                goToDetail.putExtra("ABOUT", book.getMoreDetail());
                goToDetail.putExtra("DESKRIPSI", book. getDetail());

                v.getContext().startActivity(goToDetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBook.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnDetail;


        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnDetail = itemView.findViewById(R.id.btn_set_detail);
        }

    }

}


