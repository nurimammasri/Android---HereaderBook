package com.app.hereaderbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "Hereader Book";
    private RecyclerView rvBooks;
    private ArrayList<Book> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvBooks = findViewById(R.id.rv_book);
        rvBooks.setHasFixedSize(true);

        list.addAll(BookData.getListData());
        showRecyclerCardView();


    }

    private void showRecyclerList() {
        rvBooks.setLayoutManager(new LinearLayoutManager(this));
        ListBookAdapter listBookAdapter = new ListBookAdapter(list);
        rvBooks.setAdapter(listBookAdapter);

        listBookAdapter.setOnItemClickCallback(new ListBookAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Book data) {
                showSelectedBook(data);
            }
        });
    }

    private void showRecyclerGrid() {
        rvBooks.setLayoutManager(new GridLayoutManager(this, 2));
        GridBookAdapter gridHeroAdapter = new GridBookAdapter(list);
        rvBooks.setAdapter(gridHeroAdapter);

        gridHeroAdapter.setOnItemClickCallback(new GridBookAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Book data) {
                showSelectedBook(data);
            }
        });
    }

    private void showRecyclerCardView() {
        rvBooks.setLayoutManager(new LinearLayoutManager(this));
        CardViewBookAdapter cardViewBookAdapter = new CardViewBookAdapter(list);
        rvBooks.setAdapter(cardViewBookAdapter);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedBook(Book book) {
        Toast.makeText(this, "Kamu memilih " + book.getJudul(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

        @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
//        Intent goToAbout = new Intent(MainActivity.this, AboutActivity.class);
//        startActivity(goToAbout);
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.menu_about:
                Intent goToAbout = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(goToAbout);
                break;
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;
            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                title = "Mode CardView";
                showRecyclerCardView();
                break;

        }
    }
}
