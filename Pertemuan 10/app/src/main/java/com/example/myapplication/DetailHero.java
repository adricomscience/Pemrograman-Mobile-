package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public class detailHero extends AppCompatActivity {
//    private Hero hero= new Hero();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_detail_hero);
//
//        ImageView hero_image = findViewById(R.id.iv_hero);
//        TextView hero_name = findViewById(R.id.tv_hero_name);
//        TextView hero_detail = findViewById(R.id.tv_hero_detail);
//        Bundle extras = getIntent().getExtras();
//        if (extras != null) {
//            int index = extras.getInt("index");
//            hero = HeroDataSource.getHeroData(index);
//
//            hero_image.setImageResource(hero.getPhoto());
//            hero_name.setText(hero.getName());
//            hero_detail.setText(hero.getDetail());
//        }
//    }
//}

public class DetailHero extends AppCompatActivity {

    private TextView tvJudul, tvDetail;
    private ImageView photo;
    String judul;
    String detail;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero);

        tvJudul = findViewById(R.id.tv_hero_name);
        tvDetail = findViewById(R.id.tv_hero_detail);
        photo = findViewById(R.id.iv_hero);

        judul = getIntent().getStringExtra("name");
        detail = getIntent().getStringExtra("detail");


        image = getIntent().getIntExtra("photo", 0);
        photo.setImageResource(image);
        tvDetail.setText(detail);
        tvJudul.setText(judul);

//        getIncomingExtra();

    }
//
//    private void getIncomingExtra() {
//        if(getIntent().hasExtra("photo") && getIntent().hasExtra("name") && getIntent().hasExtra("genre") && getIntent().hasExtra("detail")){
//            String foto = getIntent().getStringExtra("photo");
//            String judul = getIntent().getStringExtra("name");
//            String genre = getIntent().getStringExtra("genre");
//            String description = getIntent().getStringExtra("detail");
//
//            setDataActivity(foto, judul, genre, description);
//
//        }
//    }
//
//    private void setDataActivity(String foto, String judul, String genre, String description) {
//
//        Glide.with(Detail.this).asBitmap().load(foto).into(photo);
//
//        tvJudul.setText(judul);
//        tvGenre.setText(genre);
//        tvDescription.setText(description);
//    }
}