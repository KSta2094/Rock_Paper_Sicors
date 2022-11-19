package Main;

import Game.PrintTiltle;
import Game.Start;
import Game.Transalate;
import Game.WinState;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import static Main.Config.*;
import static Main.Config.pl_num;

public class Main  implements Runnable{
    public static void main(String[] args) throws IOException {

Main main = new Main();
        PrintTiltle.load();
    Thread t1 = new Thread(main);
    t1.start();


    }

    @Override
    public void run() {while (running){
        try {
            tick();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}



    public  void tick() throws IOException {
        PrintTiltle.print();
       Start.start();
       System.out.println("Computer chose : "+Transalate.translate(com_num)+"\n");
       WinState.winScreen(WinState.hasWon());
       System.out.println("\f");

    }
}