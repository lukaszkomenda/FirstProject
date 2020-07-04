package SophisticatedPackage.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainMovie {
    public static void main(String[] args) {

        //Lista kategorii
        List<Movie> movies = Arrays.asList(
                new Movie("Titanic", MovieCategory.ROMANTIC),
                new Movie("Matix", MovieCategory.SCI_FI),
                new Movie("Jurrasic Park", MovieCategory.SCI_FI),
                new Movie("Saw", MovieCategory.HORROR)
        );

        //wybór kategorii
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kategorię filmu. Dostępne to:");

        MovieCategory[] movieCategories = MovieCategory.values();

        //pętla for
        for(MovieCategory movieCategory : movieCategories){
            System.out.println(movieCategory.name());
        }


        String userInput = scanner.nextLine();
        System.out.println("Filmy z tej kategori:");

        for(Movie movie : movies) {
            if (movie.getMovieCategory().name().equals(userInput)) {
                System.out.println(movie.getTitle());
            }
        }


        /*

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kategorię filmu:");

        String cat = scanner.nextLine();

        System.out.println("Filmy z tej kategorii:");

        for (SophisticatedPackage.basic.Movie movie : movies) {
            System.out.println(movie.getTitle());
        }

         */

    }
}
