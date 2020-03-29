package com.app.hereaderbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRatingBar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RatingBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MoreDetailBooks extends AppCompatActivity {

    ImageView imageBooks, ic_favourite;
    TextView nameBooks, detailBooks, detailMoreBooks;
    Boolean is_favourite = false;
    AppCompatRatingBar RatingBar;
    TextView getRating;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_detail_book);

        imageBooks = findViewById(R.id.img_descripion);
        nameBooks = findViewById(R.id.tv_item_name);
        detailMoreBooks = findViewById(R.id.detail_more_books);
        detailBooks = findViewById(R.id.deskripsi);
        ic_favourite = findViewById(R.id.ic_favourite);

        RatingBar = findViewById(R.id.penilaian);
        getRating = findViewById(R.id.rate);

        tampilDetail();


        ic_favourite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (is_favourite == false) {
                    is_favourite = true;
                    ic_favourite.setColorFilter(Color.RED);

                    Toast.makeText(view.getContext(), "Love It", Toast.LENGTH_SHORT).show();
                } else {
                    is_favourite = false;
                    ic_favourite.setColorFilter(Color.BLACK);
                }
            }
        });

        //untuk kasi bintang
        RatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float nilai, boolean b) {

                getRating.setText("Rating: "+nilai);
            }
        });

    }


    private void tampilDetail() {
        Intent intent = getIntent();

        int foto = intent.getIntExtra("FOTO", 0);
        String judul = intent.getStringExtra("JUDUL");
        String about = intent.getStringExtra("ABOUT");
        String deskripsi = intent.getStringExtra("DESKRIPSI");


        // tampilkan data di titlebar
        getSupportActionBar().setTitle(judul);
        getSupportActionBar().show();
        nameBooks.setText(judul);

        // tampilkan gambar
        Glide.with(this)
                .load(foto)
                .apply(new RequestOptions().override(350, 550))
                .into(imageBooks);

        // tampilkan data judul, banyak halaman dll
        detailMoreBooks.setText(about);

        // tampilkan data deskripsi
        detailBooks.setText(deskripsi);
    }
}
