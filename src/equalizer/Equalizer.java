package equalizer;

import java.util.Random;

public class Equalizer
{
    static Random rnd = new Random();
    static final String RESET = "\u001B[0m";
    static final String MAGENTA = "\u001B[45m";
    
    public static void main(String[] args)
    {
        eqFeladat();
    }
    
    static void eqFeladat()
    {
        eq();
        eq(8, true);
        eq(12);
        eq(true);
        eq();
    }
    
    static void eq()
    {
        sorKiiras(rnd.nextInt(3, 7), false);
    }
    
    static void eq(boolean dbKiir)
    {
        sorKiiras(rnd.nextInt(3, 7), dbKiir);
    }
    
    static void eq(int db)
    {
        sorKiiras(db, false);
    }
    
    static void eq(int db, boolean dbKiir)
    {
        sorKiiras(db, dbKiir);
    }
    
    static void sorKiiras(int db, boolean dbKiir)
    {
        for (int z = 0; z < db; z++)
        {
            System.out.print(MAGENTA + " ");
        }
        System.out.println(dbKiir ? String.format(RESET + " (%d)", db) : "");
    }
}