package hu.progmatic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task38_favorite_films {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> favoriteMovies = new ArrayList<>();

        for(int i=1; i<=5 ; i++){
            System.out.println("Add your favorite movie and press ENTER: ");
            String userInput = scanner.nextLine();
            favoriteMovies.add(userInput);
            }
        System.out.println("List saved: ");
        for (String movie: favoriteMovies){
            System.out.print(movie + " ");
        }

    }
}