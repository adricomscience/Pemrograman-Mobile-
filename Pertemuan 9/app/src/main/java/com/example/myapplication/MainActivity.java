package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public class MainActivity extends AppCompatActivity {
//    private RecyclerView recyclerView;
//    private List<Hero> heroes = new ArrayList<>();
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        recyclerView = findViewById(R.id.rv_hero);
//        recyclerView.setHasFixedSize(true);
//        heroes.addAll(HeroDataSource.getListData());
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        ListHeroAdapter adapter = new ListHeroAdapter(heroes);
//        recyclerView.setAdapter(adapter);
//    }
//    private void showRecycleList() {
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        ListHeroAdapter listAdapter = new ListHeroAdapter(list);
//        recyclerView.setAdapter(listAdapter);
//
//        listAdapter.setOnItemClickCallback(new ListHeroAdapter.OnItemClickCallback() {
//            @Override
//            public void onItemClicked(Hero data) {
//                showSelectedHero(data);
//            }
//        });
//    }
//    private void showSelectedHero(Hero hero) {
//        Toast.makeText(this, "Kamu memilih " + hero.getName(), Toast.LENGTH_SHORT).show();
//    }
//}

// 2VERSION

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHeroes;
    private ArrayList<Hero> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvHeroes = findViewById(R.id.rv_hero);
        rvHeroes.setHasFixedSize(true);

        list.addAll(HeroDataSource.getListData());
        showRecycleList();

    }

    private void showRecycleList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListHeroAdapter listAdapter = new ListHeroAdapter(list);
        rvHeroes.setAdapter(listAdapter);

        listAdapter.setOnItemClickCallback(new ListHeroAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hero data) {
                showSelectedHero(data);
            }
        });
    }
    private void showSelectedHero(Hero hero) {
        Toast.makeText(this, "Kamu memilih " + hero.getName(), Toast.LENGTH_SHORT).show();
    }

}