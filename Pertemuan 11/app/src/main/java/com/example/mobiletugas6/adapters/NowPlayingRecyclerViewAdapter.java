package com.example.mobiletugas6.adapters;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mobiletugas6.R;
import com.example.mobiletugas6.models.Movie.NowPlayingModel;
import com.example.mobiletugas6.networks.Const;

import java.util.List;

public class NowPlayingRecyclerViewAdapter extends RecyclerView.Adapter<NowPlayingRecyclerViewAdapter.ViewHolder> {

    private List<NowPlayingModel> nowPlayings;
    private OnItemClick onItemClick;

    public NowPlayingRecyclerViewAdapter(List<NowPlayingModel> nowPlayings, OnItemClick onItemClick) {
        this.nowPlayings = nowPlayings;
        this.onItemClick = onItemClick;
    }

    public interface OnItemClick {
        void onClick(int pos);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_now_playing_layout, parent, false);
        return new ViewHolder(view, onItemClick);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(Const.IMG_URL_200 + nowPlayings.get(position).getImgUrl())
                .into(holder.ivMovieImg);
        holder.tvMovieTitle.setText(nowPlayings.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return nowPlayings.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        OnItemClick onItemClick;
        ImageView ivMovieImg;
        TextView tvMovieTitle;

        public ViewHolder(View view, OnItemClick onItemClick) {
            super(view);
            view.setOnClickListener(this);
            ivMovieImg = view.findViewById(R.id.iv_movie_img);
            tvMovieTitle = view.findViewById(R.id.tv_movie_title);
            this.onItemClick = onItemClick;
        }

        @Override
        public void onClick(View v) {
            onItemClick.onClick(getBindingAdapterPosition());
        }
    }
}