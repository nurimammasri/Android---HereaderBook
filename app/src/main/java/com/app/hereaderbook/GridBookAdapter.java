package com.app.hereaderbook;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridBookAdapter extends RecyclerView.Adapter<GridBookAdapter.GridViewHolder>{
    private ArrayList<Book> listBook;

    public GridBookAdapter(ArrayList<Book> list){
        this.listBook = list;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_book, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        final Book book = listBook.get(position);
        Glide.with(holder.itemView.getContext())
                .load(listBook.get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listBook.get(holder.getAdapterPosition()));

                Intent goToDetail = new Intent(v.getContext().getApplicationContext(), MoreDetailBooks.class);
                goToDetail.putExtra("FOTO", book.getPhoto());
                goToDetail.putExtra("JUDUL", book.getJudul());
                goToDetail.putExtra("ABOUT", book.getMoreDetail());
                goToDetail.putExtra("DESKRIPSI", book. getDetail());

                v.getContext().startActivity(goToDetail);
            }
        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(Book data);
    }

    @Override
    public int getItemCount() {
        return listBook.size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }

}
