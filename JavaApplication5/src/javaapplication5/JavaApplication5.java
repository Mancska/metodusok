
package javaapplication5;

public class JavaApplication5 {

    public static void main(String[] args) {
      int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
            
        }
        kiir("elsö 10 szám összege:"+osszeg);
    }
    public static void kiir(String szoveg) {
        System.out.println(szoveg);
    }
    public static void osszead(int a,int b ) {
        System.out.println("");
        
    }
}
