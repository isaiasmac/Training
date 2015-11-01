package iapps.cl.training.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import iapps.cl.training.R;
import iapps.cl.training.model.Movie;

/**
 * Created by iSaias on 11/1/15.

 */
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    Context context;
    private ArrayList<Movie> movies;

    public MovieAdapter() {}

    public MovieAdapter(@NonNull Context context) {
        this.context = context;
        this.movies = new ArrayList<>();
    }

    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                                  .inflate(R.layout.movie_item_list, parent, false);

        MovieViewHolder viewHolder = new MovieViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MovieAdapter.MovieViewHolder holder, int position) {
        holder.bindMovie(this.movies.get(position));
    }

    @Override
    public int getItemCount() {
        return this.movies.size();

    }

    public void addMovies(ArrayList<Movie> movies){
        this.movies = movies;
        notifyDataSetChanged();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{
        ImageView coverImageView;
        TextView nameMovie;

        public MovieViewHolder(View itemView) {
            super(itemView);
            coverImageView = (ImageView) itemView.findViewById(R.id.coverImageView);
            nameMovie = (TextView) itemView.findViewById(R.id.nameMovie);
        }

        public void bindMovie(Movie movie){
            nameMovie.setText(movie.getName());
        }
    }



}


