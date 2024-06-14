
//Írjatok egy programot, amely egy Set-ben eltárolja majd “visszaolvassa” a felhasználónak azt az
// 5 kedvenc filmjét, amit bekértünk tőle a konzol segítségével.
// (Külön ciklus készüljön a beolvasásra és mentésre és külön egy az eredmény kiírására)

import java.util.*;

public class Task49_Set_favoritefilms {
    public static void main(String[] args) {

        Set<String> favoriteFilms = new HashSet<>();

        System.out.println("Your favorite 5 films!");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Add your favorite film: " + favoriteFilms.size() + "/5:" );
            String userInput = scanner.nextLine();
            if(!favoriteFilms.contains(userInput)) {
                favoriteFilms.add(userInput);
            }else{
                i--;
            }
        }
        System.out.println(favoriteFilms);

    }
    }