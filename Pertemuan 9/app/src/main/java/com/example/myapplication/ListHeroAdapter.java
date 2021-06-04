package com.example.myapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

//public class ListHeroAdapter extends RecyclerView.Adapter<ListHeroAdapter.ViewHolder> {
//
//    private List<Hero> heros;
//
//    public ListHeroAdapter(List<Hero> heros) {
//        this.heros = heros;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_row_hero, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        Hero hero = heros.get(position);
//        holder.ivPhoto.setImageResource(hero.getPhoto());
//        holder.tvName.setText(hero.getName());
//        holder.tvDetail.setText(hero.getDetail());
//    }
//
//    @Override
//    public int getItemCount() {
//        return heros.size();
//    }
//
//    class ViewHolder extends RecyclerView.ViewHolder {
//        ImageView ivPhoto;
//        TextView tvName, tvDetail;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            ivPhoto = itemView.findViewById(R.id.iv_hero);
//            tvName = itemView.findViewById(R.id.tv_hero_name);
//            tvDetail = itemView.findViewById(R.id.tv_hero_detail);
//        }
//    }
//}

// 2VERSION

public class ListHeroAdapter extends RecyclerView.Adapter<ListHeroAdapter.ListViewHolder> {
    private ArrayList<Hero> listHero;

    public ListHeroAdapter(ArrayList<Hero> list) {
        this.listHero = list;
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_detail_hero, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Hero hero = listHero.get(position);
        Glide.with(holder.itemView.getContext()).load(hero.getPhoto()).apply(new RequestOptions().override(55, 55));
        holder.tvName.setText(hero.getName());
        holder.tvDetail.setText(hero.getDetail());
        holder.imgPhoto.setImageResource(hero.getPhoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                onItemClickCallback.onItemClicked(listHero.get(holder.getAdapterPosition()));
                Intent intent = new Intent(holder.itemView.getContext(), detailHero.class);
                intent.putExtra("photo", hero.getPhoto());
                intent.putExtra("name", hero.getName());
                intent.putExtra("detail", hero.getDetail());

                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvWeapon;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.iv_hero);
            tvName = itemView.findViewById(R.id.tv_hero_name);
            tvDetail = itemView.findViewById(R.id.tv_hero_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Hero data);
    }
}
