package iapps.cl.training.model;

/**
 * Created by iSaias on 10/31/15.
 */
public class Movie {

    private String name;
    private String cover;
    private int year;
    private String description;
    private int rating;
    private String genre;

    public Movie() {}

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, String cover, int year, String description, int rating, String genre) {
        this.name = name;
        this.cover = cover;
        this.year = year;
        this.description = description;
        this.rating = rating;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
