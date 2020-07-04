package SophisticatedPackage.basic;

public class Movie {

    //zmienna dynamiczna
    private String title;
    private MovieCategory movieCategory;

    //metoda do klasy MainMovie
    public Movie(String title, MovieCategory category) {
        this.title = title;
        this.movieCategory = movieCategory;
    }

    public String getTitle() {
        return title;
    }

    public MovieCategory getMovieCategory() {
        return movieCategory;
    }
}
