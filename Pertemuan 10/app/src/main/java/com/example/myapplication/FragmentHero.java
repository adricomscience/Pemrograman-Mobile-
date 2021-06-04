package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentHero extends Fragment {

    private RecyclerView rvHeroes;
    private ArrayList<Hero> list = new ArrayList<>();

    private void showRecycleList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(getActivity()));
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
        Toast.makeText(getContext(), "Kamu memilih " + hero.getName(), Toast.LENGTH_SHORT).show();
    }

    public static FragmentHero newInstance() {
        FragmentHero fragment = new FragmentHero();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_hero, container, false);

        rvHeroes = (RecyclerView) view.findViewById(R.id.rv_hero);
        rvHeroes.setHasFixedSize(true);

        list.addAll(HeroDataSource.getListData());
        showRecycleList();

        return view;
    }
}