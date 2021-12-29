package bangunruang;

//mengimport file java/util/scanner dari library
import java.util.Scanner;

public class bola {
        
    //membuat objek untuk Scanner
    Scanner userinput = new Scanner(System.in);
    
    double pi;
    
    //method konstrak
    bola(double pi){
        this.pi = pi;
    }
    
    //membuat method mencari volume bola
    void volume(){
        int i;
        double V,r;
        
        System.out.println("----MENGHITUNG VOLUME BOLA----\n");
        
        System.out.print("Masukkan jari-jari =\t");
        // nilai var menerima inputan dari user, nextFload agar bisa menginput nilai bertipe float (bukan string)
        r = userinput.nextDouble();

        //rumus mencari volume bola
        V = 4/3*pi*(r*r*r);
        System.out.println("Volume Bola =\t"+V +" cm");
        System.out.println("===================================\n\n");
    }
    
    
    
    void LuasPermukaan(){
        double L,r;
        int i;
        
        System.out.println("----MENGHITUNG LUAS PERMUKAAN BOLA----\n");
        
        System.out.print("Masukkan jari-jari =\t");
        r = userinput.nextDouble();
        
        //mencari luas permukaan bola
        L = 4*pi*(r*r);
        
        System.out.println("Luas permukaan bola =\t"+L +"cm");
        System.out.println("==================================\n\n");
    }
}