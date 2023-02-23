
package javaapplication5;

public class JavaApplication5 {
    public static void main(String[] args) {
        elso10();
        osszead(0, 0);
        
    }
    public static int elso10() {
      int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
            
        }
        return osszeg;
        
    }
    public static void kiir(String szoveg) {
        System.out.println(szoveg);
    }
    public static int osszead(int a,int b ) {
       return a+b;
        
    }
}
