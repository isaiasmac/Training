package iapps.cl.training;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import iapps.cl.training.adapters.MovieAdapter;
import iapps.cl.training.model.Movie;

public class MainActivity extends AppCompatActivity {

    public static final int SPAN_COUNT = 2;
    private RecyclerView recyclerView;
    private MovieAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        setUpRecycler();
        createMovies();
    }

    private void setUpRecycler(){
        adapter = new MovieAdapter(MainActivity.this);
        recyclerView.setLayoutManager(new GridLayoutManager(this, SPAN_COUNT));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }


    private void createMovies(){
        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 0; i < 25; i++){
            movies.add(new Movie("Movie #"+i));
        }

        adapter.addMovies(movies);
    }


}
