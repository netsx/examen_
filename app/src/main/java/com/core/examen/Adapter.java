package com.core.examen;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Pojo> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,  result;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            result = (TextView) view.findViewById(R.id.result);

        }
    }


    public Adapter(List<Pojo> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_recyclerview, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pojo movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.result.setText(movie.getMsg());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}