
package javaapplication5;

public class JavaApplication5 {
    public static void main(String[] args) {
       int osszeg= elso10();
       String kimenet = "az elso 10 szám osszege: "+osszeg+ "\n";
       kiir(kimenet);
       
       int szam1 = 7, szam2=4;
       osszeg = osszead(szam1,szam2);
       kiir("%d + %d = %d\n.".formatted(szam1,szam2,osszeg));
        osszeg =osszead(1, 2);
        osszeg =osszead(osszeg, 3);
        osszeg =osszead(osszeg, 4);
        kiir("1+2+3+4="+osszeg+"\n");
        int a = 3, b=4,c=2; 
        osszeg=osszead(a, b);
        osszeg=osszead(osszeg, c);
        String s ="%d+%d+%d gyöke:".formatted(a,b,c);
        double gyok = Math.sqrt(osszeg);
        kimenet = String.format("%s %.4f\n",s, gyok);
        kiir(kimenet);
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
