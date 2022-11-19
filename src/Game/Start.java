package Game;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import static Main.Config.*;

public class Start {

    public static void start() throws IOException {

        Scanner scanner = new Scanner(System.in);
        pl_string = scanner.nextLine();

       Transalate.translate(pl_string);
        Random rng = new Random();
        com_num = rng.nextInt(0,3);



    }
}
