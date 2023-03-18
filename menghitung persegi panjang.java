import java.util.Scanner;
import java.util.Locale;
    
class LuasPersegiPanjang {
  public static void main(String args[]){
             
    Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
    System.out.println("##  Program Java Luas Persegi Panjang  ##");
    System.out.println("=========================================");
    System.out.println();
       
    double panjang, lebar, luas;
     
    System.out.print("Input panjang persegi: ");
    panjang = input.nextDouble();
     
    System.out.print("Input lebar persegi: ");
    lebar = input.nextDouble();
    
    luas = panjang * lebar;
    luas = Math.round(luas*100)/100.0;
        
    System.out.println("Luas persegi panjang: "+luas);
   
  }
}