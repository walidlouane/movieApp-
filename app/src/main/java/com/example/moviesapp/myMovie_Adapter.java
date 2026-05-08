package com.example.moviesapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myMovie_Adapter extends RecyclerView.Adapter<myMovie_Adapter.ViewHolder> {
    MymovieData[] myMovieData;
    Context context;

    public myMovie_Adapter(Context context, MymovieData[] myMovieData) {
        this.context = context;
        this.myMovieData = myMovieData;
    }

    @NonNull
    @Override
    public myMovie_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.movie_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myMovie_Adapter.ViewHolder holder, int position) {
        final MymovieData movie = myMovieData[position];
        holder.movieImage.setImageResource(movie.getImageResId());
        holder.movieName.setText(movie.getName());
        holder.releaseDate.setText(movie.getReleaseDate());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, movie.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myMovieData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView movieImage;
        TextView movieName;
        TextView releaseDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            movieImage = itemView.findViewById(R.id.image_view);
            movieName = itemView.findViewById(R.id.textView);
            releaseDate = itemView.findViewById(R.id.release_date);
        }
    }
}
