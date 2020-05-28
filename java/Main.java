import GameDev.Game;
import Abstract.Director;
import GameDev.GameBuilder;
import GameDev.Genre;
import webDev.*;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int choice;

    public static void main(String[] args) {

        System.out.println("Choose:");
        System.out.println("1.GameDev");
        System.out.println("2.WebDev");

        choice = scanner.nextInt();
        if (choice==1){
            gameDev();
        }
        else{
            WebDev();
        }


    }

    private static void gameDev() {
        Director  director = new Director ();
        GameBuilder gameBuilder;
        Game game;

        System.out.println("What kinf of game you want ?");
        System.out.println("1.Fantasy");
        System.out.println("2.Science");

        choice = scanner.nextInt();
        if (choice==1){
            director.setGameBuilder(new GameBuilder("Ligue of Legend",12000,Genre.fantasy));
            game= director.buildGame();
        }
        else {
            director.setGameBuilder(new GameBuilder("Chemistry",12230, Genre.science));
            game=director.buildGame();
        }

        System.out.println(game);
    }

    public static void WebDev(){
        Director director = new Director ();
        Website website;
        WebBuilder webBuilder;

        System.out.println("What kinf of website you want ?");
        System.out.println("1.Visitka");
        System.out.println("2.Media");

        choice = scanner.nextInt();
        if (choice==1){
            director.setWebBuilder(new WebBuilder("Kitchen",1200, Type.Brochure));
            website = director.buildWebsite();
        }
        else {
            director.setWebBuilder(new WebBuilder("Media Club",1220,Type.Media));
            website=director.buildWebsite();
        }

        System.out.println(website);
    }
}
