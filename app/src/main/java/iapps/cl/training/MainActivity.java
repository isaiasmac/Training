package iapps.cl.training;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;

import java.util.ArrayList;

import iapps.cl.training.adapters.MovieAdapter;
import iapps.cl.training.model.Movie;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    public static int SPAN_COUNT = 2;
    private RecyclerView recyclerView;
    private MovieAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int widthp = size.x;
        int heightp = size.y;

        Log.i(TAG, " Width: " + width + " widthp: " + widthp);

        Log.i(TAG, "Grid: " + Math.floor(width / 210));
        this.SPAN_COUNT = (int) Math.floor(width / 210);

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
            movies.add(new Movie("Pelicula # " +i));
        }

        adapter.addMovies(movies);
    }


}
