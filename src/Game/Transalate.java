package Game;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import static Main.Config.*;

public class Transalate {

    public static void translate(String ch) throws IOException {


        switch (ch.toLowerCase(Locale.ROOT)){
            case "rock":
                pl_num = 0;

                break;
            case "paper":
                pl_num = 1;

                break;
            case "scissors":
                pl_num = 2;

                break;
            default:
                System.out.println("Your choice was incorrect ");
                Start.start();

                break;
        }
    }
    public static String translate(int ch) throws IOException {


        switch (ch){
            case 0:
                return "ROCK";

            case 1:
                return"PAPER";

            case 2:
                return"SCISSORS";


            default:
                System.out.println("Your choice was incorrect ");
                Start.start();
                return null;

        }
    }
}
