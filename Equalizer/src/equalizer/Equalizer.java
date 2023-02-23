
package equalizer;

import java.util.Random;

public class Equalizer {
    private static Random rnd =new Random();
    public static void main(String[] args) {
        eq(3);
        eq();
        eq(5);
        eq();
        eq(7);
    }
    public static void eq() {
        
        int db= rnd.nextInt(3,8);
        oszlop(db);
    }

    private static void oszlop(int db) {
        String szin = "\u001B[45m";
        for (int i = 0; i < db; i++) {
            System.out.print(szin +" ");  
        }
        System.out.println("");
    }
    public static void eq(int hossz) {
        oszlop(hossz);
    }
}
