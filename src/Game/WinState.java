package Game;

import static Main.Config.com_num;
import static Main.Config.pl_num;

public class WinState {

    public static int hasWon() {
        if(pl_num == com_num){
            return -1;
        }

        if(pl_num == 2 && com_num ==0){
            return 0;
        }
        if (pl_num == 0 && com_num == 2 || pl_num > com_num) {
            return 1;
        }else {
            return 0;
        }
    }

    public static void winScreen(int a){
        if (a == 1) {System.out.println("You won");
        }else if(a == 0) {
            System.out.println("You lost");
        }else {
            System.out.println("Draw ");
        }
    }
}